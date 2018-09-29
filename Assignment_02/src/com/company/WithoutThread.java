package com.company;
import java.io.*;

public class WithoutThread {
    public static void Main(String[] args) throws IOException{
        System.out.println("Running Analysis on Multiple Novel!");
        File file = new File("/Users/Janjua/Desktop/BSCS/5th Semester/Advanced Programming/Assignments/Assignment_02/src/com/company/novel_1.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        int countWord = 0;
        int characterCount = 0;
        int char_a = 0, char_b = 0, char_c = 0, char_at = 0, char_hash = 0;
        while((line = reader.readLine()) != null){
            if(!(line.equals(""))) {
                char_a += line.length() - line.replace("A", "").length();
                char_b += line.length() - line.replace("B", "").length();
                char_c += line.length() - line.replace("C", "").length();
                char_at += line.length() - line.replace("@", "").length();
                char_hash += line.length() - line.replace("#", "").length();
                characterCount += line.length();
                String[] wordList = line.split("\\s+");
                countWord += wordList.length;
            }
        }
        System.out.println("Total word count = " + countWord);
        System.out.println("Total number of characters = " + characterCount);
        System.out.println("A: " + char_a);
        System.out.println("B: " + char_b);
        System.out.println("C: " + char_c);
        System.out.println("@: " + char_at);
        System.out.println("#: " + char_hash);
    }
}
