package com.company;

import java.io.*;
import java.util.concurrent.BlockingQueue;

public class Char_B implements Runnable{
    protected BlockingQueue<String> blockingQueue = null;
    public Char_B(BlockingQueue<String> blockingQueue) {
        this.blockingQueue = blockingQueue;

    }
    @Override
    public void run() {
        BufferedReader reader = null;
        try {
            File file = new File("/Users/Janjua/Desktop/BSCS/5th Semester/Advanced Programming/Assignments/Assignment_02/src/com/company/novel_1.txt");
            reader = new BufferedReader(new FileReader(file));
            String line;
            int char_b = 0;
            while((line = reader.readLine()) != null){
                if(!(line.equals(""))) {
                    char_b += line.length() - line.replace("B", "").length();
                }
            }
            System.out.println("B: " + char_b);

            blockingQueue.put("EOF");  //When end of file has been reached

        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (IOException e) {

            e.printStackTrace();
        } catch(InterruptedException e){

        }finally{
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
