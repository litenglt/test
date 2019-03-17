package com.base.security;

import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;

public class Singnature {
	public static final String SIGNATURE_ALGORITHM = "SHA256withRSA";
	public static final String ENCODE_ALGORITHM = "SHA-256";
	 /**
		 * 签名
		 * 
		 * @param privateKey
		 *            私钥
		 * @param plain_text
		 *            明文
		 * @return
		 */
		public static byte[] sign(PrivateKey privateKey, String plain_text) {
			MessageDigest messageDigest;
			byte[] signed = null;
			try {
				messageDigest = MessageDigest.getInstance(ENCODE_ALGORITHM);
				messageDigest.update(plain_text.getBytes());
				byte[] outputDigest_sign = messageDigest.digest();
				Signature Sign = Signature.getInstance(SIGNATURE_ALGORITHM);
				Sign.initSign(privateKey);
				Sign.update(outputDigest_sign);
				signed = Sign.sign();
			} catch (NoSuchAlgorithmException | InvalidKeyException | SignatureException e) {
				e.printStackTrace();
			}
			return signed;
		}

		/**
		 * 验签
		 * 
		 * @param publicKey
		 *            公钥
		 * @param plain_text
		 *            明文
		 * @param signed
		 *            签名
		 */
		public static boolean verifySign(PublicKey publicKey, String plain_text, byte[] signed) {
			MessageDigest messageDigest;
			boolean SignedSuccess = false;
			try {
				messageDigest = MessageDigest.getInstance(ENCODE_ALGORITHM);
				messageDigest.update(plain_text.getBytes());
				byte[] outputDigest_verify = messageDigest.digest();
				Signature verifySign = Signature.getInstance(SIGNATURE_ALGORITHM);
				verifySign.initVerify(publicKey);
				verifySign.update(outputDigest_verify);
				SignedSuccess = verifySign.verify(signed);
				System.out.println("验证成功?---" + SignedSuccess);

			} catch (NoSuchAlgorithmException | InvalidKeyException | SignatureException e) {
				e.printStackTrace();
			}
			return SignedSuccess;
		}
}
