package com.company;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class AESEncryptionStrategy implements EncryptionStrategy {
    @Override
    public void encryptData(String plainText) throws Exception{
        System.out.println("Message to Encrypt: " + plainText);
        byte[]  encKey = "SomeRandomKeyDop".getBytes();
        try{
            SecretKeySpec skeySpec = new SecretKeySpec(encKey, "AES");
            Cipher ciper = Cipher.getInstance("AES");
            ciper.init(Cipher.ENCRYPT_MODE, skeySpec);
            byte[] encrypted = ciper.doFinal((new BASE64Decoder()).decodeBuffer(plainText));
            String EncText = new BASE64Encoder().encode(encrypted);
            System.out.println("Encrypted String (AES): " + EncText);
        }catch (Exception e){
            System.out.println(e.getLocalizedMessage());
            throw e;
        }

    }

}
