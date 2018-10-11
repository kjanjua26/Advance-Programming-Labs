package com.company;
import sun.misc.BASE64Encoder;

import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;

public class BlowFishEncryptionStrategy implements EncryptionStrategy {
    public String encryptData(String plainText, String Key) throws Exception{
        byte[] key = Key.getBytes();
        String IV = "12345678";
        SecretKeySpec keySpec = new SecretKeySpec(key, "Blowfish");
        Cipher cipher = Cipher.getInstance("Blowfish/CBC/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, keySpec, new javax.crypto.spec.IvParameterSpec(IV.getBytes()));
        byte[] encoding = cipher.doFinal(plainText.getBytes("UTF-8"));
        String EncText = new BASE64Encoder().encode(encoding);
        return EncText;
    }
}
