/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.io.*;  
import java.net.*;  
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import sun.misc.BASE64Decoder;

/**
 *
 * @author mijaz.bscs16seecs
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
    try{  
        ServerSocket ss=new ServerSocket(9192);  
        Socket s=ss.accept();//establishes connection   
        DataInputStream dis=new DataInputStream(s.getInputStream());  
         System.out.println(dis.readUTF()); 
        String  key=(String)dis.readUTF();  
        System.out.println("Key = "+key);  
        String  algo=(String)dis.readUTF();  
        System.out.println("Algo = "+algo);  
        String  msg=(String)dis.readUTF();  
        System.out.println("Msg = "+msg); 
        String  encmsg=(String)dis.readUTF();  
        System.out.println("Encrypted Msg = "+encmsg); 
        int  hashint=(Integer)dis.readInt();  
        System.out.println("Hash = "+hashint); 
        DataOutputStream dist = new DataOutputStream(s.getOutputStream());
       
        
        
       String DycHash = DecryptHash(key,algo,hashint, encmsg);
       System.out.println(DycHash); 
       if(DycHash.equals(msg)){
            dist.writeUTF("The server has successfully acknowledged and hash is same");
       }else{
           dist.writeUTF("Hash is not same. Redo!");
       }
       ss.close(); 
    }catch(Exception e){System.out.println(e);}  
    }  
    static String  DecryptHash(String key, String Algo, int hash, String encmsg) throws Exception{
        if(Algo.equals("AES")){
            byte[] dyckey = key.getBytes();
            String IV = "12345678";
            SecretKeySpec skeyspec = new SecretKeySpec(dyckey, Algo);
            Cipher c = Cipher.getInstance(Algo);
            c.init(Cipher.DECRYPT_MODE, skeyspec);
            byte[] decordedValue = new BASE64Decoder().decodeBuffer(encmsg);
            byte[] decValue = c.doFinal(decordedValue);
            String decVal = new String(decValue);
            return decVal;
        }else if(Algo.equals("BFish")){
            byte[] dyckey = key.getBytes();
            String IV = "12345678";
            SecretKeySpec skeyspec = new SecretKeySpec(dyckey,"Blowfish");
            Cipher c = Cipher.getInstance("Blowfish/CBC/PKCS5Padding");
            c.init(Cipher.DECRYPT_MODE, skeyspec,new javax.crypto.spec.IvParameterSpec(IV.getBytes()));
            byte[] decordedValue = new BASE64Decoder().decodeBuffer(encmsg);
            byte[] decValue = c.doFinal(decordedValue);
            String decVal = new String(decValue);
            return decVal;
        }
        else if(Algo.equals("TDES")){
            byte[] dyckey = key.getBytes();
            String IV = "12345678";
            SecretKeySpec skeyspec = new SecretKeySpec(dyckey, "DESede");
            Cipher c = Cipher.getInstance("DESede/CBC/PKCS5Padding");
            c.init(Cipher.DECRYPT_MODE, skeyspec,new javax.crypto.spec.IvParameterSpec(IV.getBytes()));
            byte[] decordedValue = new BASE64Decoder().decodeBuffer(encmsg);
            byte[] decValue = c.doFinal(decordedValue);
            String decVal = new String(decValue);
            return decVal;
        }else return "Error";
    }
}  
