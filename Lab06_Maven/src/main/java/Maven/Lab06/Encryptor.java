package Maven.Lab06;

public class Encryptor {
    private String AlgoName;
    private String plainText;
    public Encryptor(String AlgoName, String plainText){
        this.AlgoName = AlgoName;
        this.plainText = plainText;
    }
    public String getAlgo() throws Exception{
        if(AlgoName.equals("AES")){
            return new AESEncryptionStrategy().encryptData(plainText, "SomeRandomShit12");
        }
        else if(AlgoName.equals("BFish")){
            return new BlowFishEncryptionStrategy().encryptData(plainText, "SomeRandomShit12");
        }else if(AlgoName.equals("TDES")){
            return new TripleDESEncryptionStrategy().encryptData(plainText, "SomeRandomShit1234459jar");
        }else return "Enter Valid Algo Type!";
    }
}

