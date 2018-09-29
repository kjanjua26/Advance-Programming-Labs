package com.company;
import java.io.*;
import java.util.concurrent.BlockingQueue;
public class Char_C implements Runnable {
    protected BlockingQueue<String> blockingQueue = null;
    public Char_C(BlockingQueue<String> blockingQueue) {
        this.blockingQueue = blockingQueue;

    }
    @Override
    public void run() {
        BufferedReader reader = null;
        try {
            File file = new File("/Users/Janjua/Desktop/BSCS/5th Semester/Advanced Programming/Assignments/Assignment_02/src/com/company/novel_1.txt");
            reader = new BufferedReader(new FileReader(file));
            for(int i = 70; i <= 88; i++){
                counter(i);
            }
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
    public void counter(int inp) throws IOException{
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
