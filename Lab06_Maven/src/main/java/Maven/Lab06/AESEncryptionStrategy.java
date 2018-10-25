package Maven.Lab06;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class AESEncryptionStrategy implements EncryptionStrategy {
    public String encryptData(String plainText, String Key) throws Exception{
        System.out.println("Message to Encrypt: " + plainText);
        byte[] encKey = Key.getBytes();
        SecretKeySpec skeySpec = new SecretKeySpec(encKey, "AES");
        Cipher ciper = Cipher.getInstance("AES");
        ciper.init(Cipher.ENCRYPT_MODE, skeySpec);
        byte[] encrypted = ciper.doFinal(plainText.getBytes("UTF-8"));
        String EncText = new BASE64Encoder().encode(encrypted);
        return EncText;
    }
    public String decryptData(String encmsg, String Key) throws Exception{
    	byte[] dyckey = Key.getBytes();
        String IV = "12345678";
        SecretKeySpec skeyspec = new SecretKeySpec(dyckey, "AES");
        Cipher c = Cipher.getInstance("AES");
        c.init(Cipher.DECRYPT_MODE, skeyspec);
        byte[] decordedValue = new BASE64Decoder().decodeBuffer(encmsg);
        byte[] decValue = c.doFinal(decordedValue);
        String decVal = new String(decValue);
        return decVal;
    }

}
