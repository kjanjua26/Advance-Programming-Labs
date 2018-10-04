package com.company;

import sun.misc.BASE64Encoder;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class TripleDESEncryptionStrategy implements EncryptionStrategy {
    public void encryptData(String plainText) throws Exception{
        byte[] key = "SomeRandomKeyDopVeryCool".getBytes();
        String IV = "12345678";
        SecretKeySpec spec = new SecretKeySpec(key, "DESede");
        Cipher cipher = Cipher.getInstance("DESede/CBC/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, spec, new javax.crypto.spec.IvParameterSpec(IV.getBytes()));
        byte[] encoding = cipher.doFinal(plainText.getBytes());
        String EncText = new BASE64Encoder().encode(encoding);
        System.out.println("Message to Encrypt: " + plainText);
        System.out.println("Encrypted String (TripleDES): " + EncText);
    }
}
