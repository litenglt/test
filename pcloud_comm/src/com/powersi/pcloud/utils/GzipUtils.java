package com.powersi.pcloud.utils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.powersi.comm.exception.ApusException;
import com.powersi.comm.utils.ToolUtil;
/**
 * 使用gzip进行字符串的压缩和解压缩的工具类
 * 由于此类不是每个项目必须要用到的，因此service不采用注解定义，需要使用的工程请定义本service到xml中
 * @author 黄尧
 *
 */
public class GzipUtils {
	Logger logger  = LoggerFactory.getLogger(this.getClass());

	/**
	 * 使用gzip进行压缩
	 * @param primStr 需要压缩的字符串
	 * @return 压缩后的字符串
	 */
	public byte[] gzip(String primStr) {
		//空 字符串不进行压缩
		if (primStr == null || primStr.length() == 0) {
			return null;
		}
		
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		GZIPOutputStream gzip = null;
		try {
			gzip = new GZIPOutputStream(out);
			gzip.write(primStr.getBytes("UTF-8"));
		} catch (IOException e) {
			throw new ApusException("使用gzip进行压缩时异常",e);
		} finally {
			//释放gzip
			if (gzip != null) {
				try {
					gzip.close();
				} catch (IOException e) {
					logger.error("使用gzip进行压缩,关闭压缩流异常,异常信息:"+ToolUtil.getExceptionInfo(e));
				}
			}
		}
		return out.toByteArray();
	}

	/**
	 * 
	 * 使用gzip进行解压缩
	 * @param compressedStr 压缩字符串
	 * @return  解压之后的字符串
	 */
	public  String gunzip(byte[] compressed) {
		//传如字符串为空 时不进行解压
		if (compressed == null) {
			return null;
		}
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		ByteArrayInputStream in = null;
		GZIPInputStream ginzip = null;
		//byte[] compressed = null;
		String decompressed = null;
		try {
			//compressed = new sun.misc.BASE64Decoder().decodeBuffer(compressedStr);
			in = new ByteArrayInputStream(compressed);
			ginzip = new GZIPInputStream(in);

			byte[] buffer = new byte[1024];
			int offset = -1;
			while ((offset = ginzip.read(buffer)) != -1) {
				out.write(buffer, 0, offset);
			}
			decompressed = out.toString();
		} catch (IOException e) {
			throw new ApusException("使用gzip进行解压缩时异常",e);
		} finally {
			if (ginzip != null) {
				try {
					ginzip.close();
				} catch (IOException e) {
					logger.error("使用gzip进行压缩时ginzip流关闭异常,异常信息:"+ToolUtil.getExceptionInfo(e));
				}
			}
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					logger.error("使用gzip进行压缩时字节数据输入p流关闭异常,异常信息:"+ToolUtil.getExceptionInfo(e));
				}
			}
			if (out != null) {
				try {
					out.flush();
					out.close();
				} catch (IOException e) {
					logger.error("使用gzip进行压缩时字节数据输出流关闭异常,异常信息:"+ToolUtil.getExceptionInfo(e));
				}
			}
		}

		return decompressed;
	}

}
