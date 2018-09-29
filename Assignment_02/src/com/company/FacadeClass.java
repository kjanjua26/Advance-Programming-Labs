package com.company;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class FacadeClass {
    public void callMe(){
        BlockingQueue<String> queue = new ArrayBlockingQueue<>(1024);
        Char_A charA = new Char_A(queue);
        Char_B charB = new Char_B(queue);
        Char_C charC = new Char_C(queue);
        Char_Hash charHash = new Char_Hash(queue);
        Chat_At charAt = new Chat_At(queue);

        new Thread(charA).start();
        new Thread(charB).start();
        new Thread(charC).start();
        new Thread(charHash).start();
        new Thread(charAt).start();
    }
}
