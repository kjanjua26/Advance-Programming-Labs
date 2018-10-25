package Maven.Lab06;

public interface EncryptionStrategy {
    String encryptData(String plainText, String Key) throws Exception;
    String decryptData(String plainText, String Key) throws Exception;
}

