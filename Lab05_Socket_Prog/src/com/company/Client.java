package com.company;

import java.util.Scanner;
import java.io.*;
import java.net.*;
public class Client {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Crypto World via Server/Client Paradigm!");
        System.out.println("Which Algo would you like to choose? (AES/BFish/TDES)");
        Scanner in = new Scanner(System.in);
        String algName = in.next();
        System.out.println("Enter message you would like to encrypt?");
        Scanner inp = new Scanner(System.in);
        String msg = inp.next();
        System.out.println("Enter key you would like to use? (16/16/24)");
        Scanner inp_another = new Scanner(System.in);
        String key = inp_another.next();
        Encryptor enc = new Encryptor(algName, msg, key);
        String encMsg = enc.getAlgo();
        int hashEncMsg = encMsg.hashCode();

        try{
            Socket soc = new Socket("10.3.31.224", 9192);
            DataOutputStream dataOut = new DataOutputStream(soc.getOutputStream());
            DataInputStream dataIn = new DataInputStream(soc.getInputStream());
            dataOut.writeUTF("Hello, Server sending Key, AlgName, Msg");
            dataOut.writeUTF(key);
            dataOut.writeUTF(algName);
            dataOut.writeUTF(msg);
            dataOut.writeUTF(encMsg);
            dataOut.writeInt(hashEncMsg);
            System.out.println(dataIn.readUTF());
            dataOut.flush();
            dataOut.close();
            soc.close();
        }catch(Exception e){
            System.out.println("Exception: " + e);
        }

    }
}
