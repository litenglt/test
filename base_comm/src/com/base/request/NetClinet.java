package com.base.request;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;



public class NetClinet {
	private String charset = "UTF-8";
	public static int connectTimeout = 10000;

	private static TrustManager myX509TrustManager = new X509TrustManager() {
		public X509Certificate[] getAcceptedIssuers() {
			return null;
		}

		public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
		}

		public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
		}
	};

	private static TrustManager[] myX509TrustManagers = { myX509TrustManager };

	private static HostnameVerifier ALLOW_ALL_HOSTNAME_VERIFIER = new HostnameVerifier() {
		public boolean verify(String urlHostName, SSLSession session) {
			return true;
		}
	};

	public NetClinet(){
	    HttpsURLConnection.setDefaultHostnameVerifier(ALLOW_ALL_HOSTNAME_VERIFIER);
	  }

	public int doGet(String url, Map<String, String> mapHeader, int nTimeOut, StringBuffer sbRet) {
		try {
			URL localURL = new URL(url);
			URLConnection connection = localURL.openConnection();
			connection.setConnectTimeout(connectTimeout);
			connection.setReadTimeout(nTimeOut);
			HttpURLConnection httpURLConnection = (HttpURLConnection) connection;
			httpURLConnection.setRequestProperty("Accept-Charset", this.charset);
			httpURLConnection.setRequestProperty("Content-Type",
					"application/x-www-form-urlencoded; charset=" + this.charset);
			HttpsURLConnection httpsConn;
			if ("https".equalsIgnoreCase(url.substring(0, 5))) {
				SSLContext sslcontext = SSLContext.getInstance("TLS");
				sslcontext.init(null, myX509TrustManagers, null);
				httpsConn = (HttpsURLConnection) httpURLConnection;

				httpsConn.setSSLSocketFactory(sslcontext.getSocketFactory());
			}

			if (mapHeader != null) {
				for (String key : mapHeader.keySet()) {
					httpURLConnection.setRequestProperty(key, (String) mapHeader.get(key));
				}
			}
			InputStream inputStream = null;
			InputStreamReader inputStreamReader = null;
			BufferedReader reader = null;
			String tempLine = null;

			if (httpURLConnection.getResponseCode() >= 300)
				throw new Exception(
						"HTTP Request is not success, Response code is " + httpURLConnection.getResponseCode());
			try {
				inputStream = httpURLConnection.getInputStream();

				ByteArrayOutputStream stream = new ByteArrayOutputStream();
				byte[] buff = new byte[2048];
				int nRead = inputStream.read(buff, 0, 2048);
				while (nRead > 0) {
					stream.write(buff, 0, nRead);
					nRead = inputStream.read(buff, 0, 2048);
				}
				byte[] buff_str = stream.toByteArray();
				String sTmp = new String(buff_str, 0, buff_str.length, this.charset);
				sbRet.append(sTmp);
			} finally {
				if (reader != null) {
					reader.close();
				}
				if (inputStreamReader != null) {
					inputStreamReader.close();
				}
				if (inputStream != null) {
					inputStream.close();
				}
			}

			return httpURLConnection.getResponseCode();
		} catch (Exception ex) {
			if ((ex instanceof ConnectException))
				throw new RuntimeException("调用Http请求时发生连接超时异常, url:" + url + ", msg: " + ex.getMessage(),
						ex);
			if ((ex instanceof SocketTimeoutException))
				throw new RuntimeException("调用Http请求时发生读取应答超时异常, url:" + url + ", msg: " + ex.getMessage(),
						ex);
		}
		return 0;
	}

	public int doPost(String url, Map<String, String> mapHeader, Map<String, String> parameterMap, int nTimeOut,
			StringBuffer sbRet) {
		try {
			StringBuffer parameterBuffer = new StringBuffer();
			if (parameterMap != null) {
				Iterator iterator = parameterMap.keySet().iterator();
				String key = null;
				String value = null;
				while (iterator.hasNext()) {
					key = (String) iterator.next();
					if (parameterMap.get(key) != null)
						value = (String) parameterMap.get(key);
					else {
						value = "";
					}

					parameterBuffer.append(key).append("=").append(URLEncoder.encode(value, this.charset));
					if (iterator.hasNext()) {
						parameterBuffer.append("&");
					}
				}
			}
			return doPost(url, mapHeader, parameterBuffer.toString(), nTimeOut, sbRet);
		} catch (Exception ex) {
			if ((ex instanceof ConnectException))
				throw new RuntimeException("调用Http请求时发生连接超时异常, url:" + url + ", msg: " + ex.getMessage(),
						ex);
			if ((ex instanceof SocketTimeoutException))
				throw new RuntimeException("调用Http请求时发生读取应答超时异常, url:" + url + ", msg: " + ex.getMessage(),
						ex);
		}
		return 0;
	}

	public int doPost(String url, Map<String, String> mapHeader, String sContent, int nTimeOut, StringBuffer sbRet) {
		try {
			return doPost(url, mapHeader, sContent.getBytes(this.charset), nTimeOut, sbRet);
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}
		
	}

	public int doPost(String url, Map<String, String> mapHeader, byte[] baos, int nTimeOut, StringBuffer sbRet) {
		try {
			URL localURL = new URL(url);
			URLConnection connection = localURL.openConnection();
			connection.setConnectTimeout(connectTimeout);
			connection.setReadTimeout(nTimeOut);
			HttpURLConnection httpURLConnection = (HttpURLConnection) connection;
			httpURLConnection.setDoOutput(true);
			httpURLConnection.setRequestMethod("POST");
			httpURLConnection.setRequestProperty("Accept-Charset", this.charset);
			httpURLConnection.setRequestProperty("Content-Type",
					"application/x-www-form-urlencoded; charset=" + this.charset);
			httpURLConnection.setRequestProperty("Content-Length", Long.toString(baos.length));
			SSLContext sslcontext;
			if ("https".equalsIgnoreCase(url.substring(0, 5))) {
				HttpsURLConnection httpsConn = (HttpsURLConnection) httpURLConnection;

				sslcontext = SSLContext.getInstance("TLS");
				sslcontext.init(null, myX509TrustManagers, null);

				httpsConn.setSSLSocketFactory(sslcontext.getSocketFactory());
			}
			if (mapHeader != null) {
				for (String key : mapHeader.keySet()) {
					httpURLConnection.setRequestProperty(key, (String) mapHeader.get(key));
				}
			}
			OutputStream outputStream = null;
			InputStream inputStream = null;
			BufferedReader reader = null;
			String tempLine = null;
			try {
				outputStream = httpURLConnection.getOutputStream();
				outputStream.write(baos);
				outputStream.flush();

				if (httpURLConnection.getResponseCode() >= 300) {
					throw new Exception(
							"HTTP Request is not success, Response code is " + httpURLConnection.getResponseCode());
				}

				inputStream = httpURLConnection.getInputStream();

				ByteArrayOutputStream stream = new ByteArrayOutputStream();
				byte[] buff = new byte[2048];
				int nRead = inputStream.read(buff, 0, 2048);
				while (nRead > 0) {
					stream.write(buff, 0, nRead);
					nRead = inputStream.read(buff, 0, 2048);
				}
				byte[] buff_str = stream.toByteArray();
				String sTmp = new String(buff_str, 0, buff_str.length, this.charset);
				sbRet.append(sTmp);
			} finally {
				if (outputStream != null) {
					outputStream.close();
				}
				if (reader != null) {
					reader.close();
				}
				
				if (inputStream != null) {
					inputStream.close();
				}
			}
			return httpURLConnection.getResponseCode();
		} catch (Exception ex) {
			if ((ex instanceof ConnectException))
				throw new RuntimeException("调用Http请求时发生连接超时异常, url:" + url + ", msg: " + ex.getMessage(), ex);
			if ((ex instanceof SocketTimeoutException))
				throw new RuntimeException("调用Http请求时发生读取应答超时异常, url:" + url + ", msg: " + ex.getMessage(), ex);
		}
		
		return 0;
	}

	public boolean downloadFile(String url, String savePath) {
		try {
			URL localURL = new URL(url);
			URLConnection connection = localURL.openConnection();
			HttpURLConnection httpURLConnection = (HttpURLConnection) connection;
			httpURLConnection.setRequestProperty("Accept-Charset", this.charset);
			httpURLConnection.setRequestProperty("Content-Type",
					"application/x-www-form-urlencoded; charset=" + this.charset);
			if ("https".equalsIgnoreCase(url.substring(0, 5))) {
				SSLContext sslcontext = SSLContext.getInstance("TLS");
				sslcontext.init(null, myX509TrustManagers, null);
				HttpsURLConnection httpsConn = (HttpsURLConnection) httpURLConnection;

				httpsConn.setSSLSocketFactory(sslcontext.getSocketFactory());
			}

			InputStream inputStream = null;
			InputStreamReader inputStreamReader = null;
			BufferedReader reader = null;

			if (httpURLConnection.getResponseCode() >= 300)
				throw new Exception(
						"HTTP Request is not success, Response code is " + httpURLConnection.getResponseCode());
			try {
				inputStream = httpURLConnection.getInputStream();
				File file = new File(savePath);
				FileOutputStream fos = new FileOutputStream(file);

				byte[] buff = new byte[2048];
				int len = 0;
				while ((len = inputStream.read(buff)) != -1) {
					fos.write(buff, 0, len);
				}
				fos.flush();
				if (fos != null)
					try {
						fos.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
			} finally {
				if (reader != null) {
					reader.close();
				}
				if (inputStreamReader != null) {
					inputStreamReader.close();
				}
				if (inputStream != null) {
					inputStream.close();
				}
			}
			return true;
		} catch (Exception ex) {
			if ((ex instanceof ConnectException))
				throw new RuntimeException("调用Http请求时发生连接超时异常, url:" + url + ", msg: " + ex.getMessage(), ex);
			if ((ex instanceof SocketTimeoutException))
				throw new RuntimeException("调用Http请求时发生读取应答超时异常, url:" + url + ", msg: " + ex.getMessage(), ex);
		}
		return false;

	}

	public boolean matcher(String s, String pattern) {
		Pattern p = Pattern.compile(pattern, 66);
		Matcher matcher = p.matcher(s);

		return matcher.find();
	}

	public String getCharset() {
		return this.charset;
	}

	public void setCharset(String charset) {
		this.charset = charset;
	}
}
