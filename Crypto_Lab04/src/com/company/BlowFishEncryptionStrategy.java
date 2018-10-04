package com.company;
import sun.misc.BASE64Encoder;

import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;

public class BlowFishEncryptionStrategy implements EncryptionStrategy {
    final protected static char[] hexArr = "0123456789ABCDEF".toCharArray();
    public void encryptData(String plainText) throws Exception{
        byte[] key = "SomeRandomKeyDop".getBytes();
        String IV = "12345678";
        SecretKeySpec keySpec = new SecretKeySpec(key, "Blowfish");
        Cipher cipher = Cipher.getInstance("Blowfish/CBC/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, keySpec, new javax.crypto.spec.IvParameterSpec(IV.getBytes()));
        byte[] encoding = cipher.doFinal(plainText.getBytes());
        String EncText = new BASE64Encoder().encode(encoding);
        System.out.println("Message to Encrypt: " + plainText);
        System.out.println("Encrypted String (Blowfish): " + EncText);
    }
}
