package Maven.Lab06;

import java.util.Scanner;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase{
    public AppTest( String testName ){
        super( testName );
    }
    public static Test suite(){
        return new TestSuite( AppTest.class );
    }
    public void testApp() throws Exception{
        System.out.println("For AES!");
        Encryptor enc = new Encryptor("AES", "Kamran");
        String encText = enc.getAlgo();
        Decryptor dec = new Decryptor("AES", encText);
        String decText = dec.getAlgo();
        if("Kamran".equals(decText)){
        	assertEquals("Kamran", decText);
        	System.out.println("AES Passed.");
        }
        else{
        	System.out.println("Not Passed!");
        	fail("The AES test is failed");
        }
        
        System.out.println("For TDES!");
        Encryptor Tenc = new Encryptor("TDES", "Kamran");
        String TencText = Tenc.getAlgo();
        Decryptor Tdec = new Decryptor("TDES", TencText);
        String TdecText = Tdec.getAlgo();
        if("Kamran".equals(TdecText)){
        	assertEquals("Kamran", TdecText);
        	System.out.println("TDES Passed.");
        }
        else{
        	System.out.println("Not Passed!");
        	fail("The TDES test is failed");
        }
        System.out.println("For BFish!");
        Encryptor Fenc = new Encryptor("BFish", "Kamran");
        String FencText = Fenc.getAlgo();
        Decryptor Fdec = new Decryptor("BFish", FencText);
        String FdecText = Fdec.getAlgo();
        if("Kamran".equals(FdecText)){
        	assertEquals("Kamran", FdecText);
        	System.out.println("BFish Passed.");
        }
        else{
        	System.out.println("Not Passed!");
        	fail("The BFish test is failed");
        }
        
    }
}
