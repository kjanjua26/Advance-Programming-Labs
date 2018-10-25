package Maven.Lab06;

public class Decryptor {
	private String AlgoName;
    private String encMsg;
    public Decryptor(String AlgoName, String encMsg){
        this.AlgoName = AlgoName;
        this.encMsg = encMsg;
    }
    public String getAlgo() throws Exception{
        if(AlgoName.equals("AES")){
            return new AESEncryptionStrategy().decryptData(encMsg, "SomeRandomShit12");
        }else if(AlgoName.equals("BFish")){
            return new BlowFishEncryptionStrategy().decryptData(encMsg, "SomeRandomShit12");
        }else if(AlgoName.equals("TDES")){
            return new TripleDESEncryptionStrategy().decryptData(encMsg, "SomeRandomShit1234459jar");
        }else return "Enter Valid Algo Type!";
    }
}
