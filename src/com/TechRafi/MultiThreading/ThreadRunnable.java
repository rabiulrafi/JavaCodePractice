package com.TechRafi.MultiThreading;

import static java.lang.Thread.*;

public class ThreadRunnable implements Runnable{

    @Override
    public void run() {
        for(int i=1;i<=5;i++){
            System.out.println(i);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
