package com.company;

public interface EncryptionStrategy {
    String encryptData(String plainText, String Key) throws Exception;
}
