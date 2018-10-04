package com.company;

public class Encryptor {
    private String AlgoName;
    private String plainText;
    public Encryptor(String AlgoName, String plainText){
        this.AlgoName = AlgoName;
        this.plainText = plainText;
    }
    public void getAlgo() throws Exception{
        if(AlgoName.equals("AES")){
            new AESEncryptionStrategy().encryptData(plainText);
        }
        else if(AlgoName.equals("BFish")){
            new BlowFishEncryptionStrategy().encryptData(plainText);
        }else if(AlgoName.equals("TDES")){
            new TripleDESEncryptionStrategy().encryptData(plainText);
        }else System.out.println("Enter Valid Algo Type!");
    }
}
