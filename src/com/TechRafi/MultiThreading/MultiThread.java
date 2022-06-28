package com.TechRafi.MultiThreading;

public class MultiThread extends Thread {
    private int threadNum;
    MultiThread(int threadNum){
        this.threadNum=threadNum;
    }
    @Override
    public void run() {
        for(int i=1;i<=5;i++){
            System.out.println("Thread #"+threadNum+": "+i);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
