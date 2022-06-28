package com.TechRafi.MultiThreading;

public class MultiThreadMain {
    public static void main(String[] args) {

        MultiThread thread1=new MultiThread(1);
        MultiThread thread2=new MultiThread(2);
        MultiThread thread3=new MultiThread(3);


        thread1.start();
        thread2.start();
        thread3.start();


        //Thread Priority
        /*thread1.setPriority(7);
        thread2.setPriority(8);
        thread3.setPriority(6);*/

        //ThreadRunnable thread= new ThreadRunnable();
//        Thread runnable= new Thread(thread);
//        runnable.start();
    }
}
