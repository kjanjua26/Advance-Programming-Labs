package Maven.Lab06;

import sun.misc.BASE64Encoder;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import sun.misc.BASE64Decoder;
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
    public String decryptData(String encmsg, String Key) throws Exception{
    	byte[] dyckey = Key.getBytes();
        String IV = "12345678";
        SecretKeySpec skeyspec = new SecretKeySpec(dyckey,"Blowfish");
        Cipher c = Cipher.getInstance("Blowfish/CBC/PKCS5Padding");
        c.init(Cipher.DECRYPT_MODE, skeyspec,new javax.crypto.spec.IvParameterSpec(IV.getBytes()));
        byte[] decordedValue = new BASE64Decoder().decodeBuffer(encmsg);
        byte[] decValue = c.doFinal(decordedValue);
        String decVal = new String(decValue);
        return decVal;
    }
}
