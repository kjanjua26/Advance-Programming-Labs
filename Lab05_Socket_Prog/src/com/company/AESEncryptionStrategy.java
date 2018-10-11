package com.company;
import sun.misc.BASE64Encoder;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class AESEncryptionStrategy implements EncryptionStrategy {
    @Override
    public String encryptData(String plainText, String Key) throws Exception{
        byte[] encKey = Key.getBytes();
        SecretKeySpec skeySpec = new SecretKeySpec(encKey, "AES");
        Cipher ciper = Cipher.getInstance("AES");
        ciper.init(Cipher.ENCRYPT_MODE, skeySpec);
        byte[] encrypted = ciper.doFinal(plainText.getBytes("UTF-8"));
        String EncText = new BASE64Encoder().encode(encrypted);
        return EncText;
    }

}
