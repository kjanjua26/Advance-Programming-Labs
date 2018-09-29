package com.company;
import java.io.*;

public class Main {
    /*
    public static void main(String[] args) throws IOException {
        System.out.println("Running Analysis on Multiple Novel with Threads!");
        long start = System.nanoTime();
        FacadeClass fr = new FacadeClass();
        fr.callMe();
        long end = System.nanoTime();
        long output = end - start;
        System.out.println("Elapsed time in milliseconds: " + output / 1000000.0);
    }*/
    public static void main(String[] args) throws IOException{
        System.out.println("Running Analysis on Multiple Novel without Threads!");
        long start = System.nanoTime();
        for (int i = 32; i <= 126; i++){
            counter(i);
        }
        long end = System.nanoTime();
        long output = end - start;
        System.out.println("Elapsed time in milliseconds: " + output / 1000000);
    }
    public static void counter(int inp) throws IOException{
        File file = new File("/Users/Janjua/Desktop/BSCS/5th Semester/Advanced Programming/Assignments/Assignment_02/src/com/company/novel_1.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        int char_a_ = 0;
        while((line = reader.readLine()) != null){
            if(!(line.equals(""))) {
                char_a_ += line.length() - line.replace(String.valueOf(Character.toChars(inp)), "").length();
            }
        }
        System.out.println((char)inp + ": " + char_a_);

    }
}

