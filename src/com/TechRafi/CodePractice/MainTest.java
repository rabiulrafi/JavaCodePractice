package com.TechRafi.CodePractice;

import java.util.Random;

public class MainTest {
    private static int a;

    public MainTest() {
        a++;
    }

    public static void main(String[] args) {
        MainTest x= new MainTest();
        MainTest y= new MainTest();
        MainTest z= new MainTest();
        MainTest w= new MainTest();
        System.out.println(a);
        Random rand = new Random();
        double pro= rand.nextDouble();
        System.out.println(pro);
    }
}
