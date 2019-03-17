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
		 * ǩ��
		 * 
		 * @param privateKey
		 *            ˽Կ
		 * @param plain_text
		 *            ����
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
		 * ��ǩ
		 * 
		 * @param publicKey
		 *            ��Կ
		 * @param plain_text
		 *            ����
		 * @param signed
		 *            ǩ��
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
				System.out.println("��֤�ɹ�?---" + SignedSuccess);

			} catch (NoSuchAlgorithmException | InvalidKeyException | SignatureException e) {
				e.printStackTrace();
			}
			return SignedSuccess;
		}
}
