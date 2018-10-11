package com.company;

public class Encryptor {
    private String AlgoName;
    private String Key;
    private String plainText;
    public Encryptor(String AlgoName, String plainText, String Key){
        this.AlgoName = AlgoName;
        this.plainText = plainText;
        this.Key = Key;
    }
    public String getAlgo() throws Exception{
        if(AlgoName.equals("AES")){
            return new AESEncryptionStrategy().encryptData(plainText, Key);
        }
        else if(AlgoName.equals("BFish")){
            return new BlowFishEncryptionStrategy().encryptData(plainText, Key);
        }else if(AlgoName.equals("TDES")){
            return new TripleDESEncryptionStrategy().encryptData(plainText, Key);
        }else {
            return "Enter Correct Algo!";
        }
    }
}
