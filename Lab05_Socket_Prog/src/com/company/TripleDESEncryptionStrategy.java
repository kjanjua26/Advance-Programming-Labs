package com.company;

import sun.misc.BASE64Encoder;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class TripleDESEncryptionStrategy implements EncryptionStrategy {
    public String encryptData(String plainText, String Key) throws Exception{
        byte[] key = Key.getBytes();
        String IV = "12345678";
        SecretKeySpec spec = new SecretKeySpec(key, "DESede");
        Cipher cipher = Cipher.getInstance("DESede/CBC/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, spec, new javax.crypto.spec.IvParameterSpec(IV.getBytes()));
        byte[] encoding = cipher.doFinal(plainText.getBytes("UTF-8"));
        String EncText = new BASE64Encoder().encode(encoding);
        return EncText;
    }
}
