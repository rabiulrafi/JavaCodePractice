package com.TechRafi.InterfaceTest;

public class InterfaceTest {
    public static void main(String[] args) {

        ByTwos two= new ByTwos();

        for (int i=0;i<=5;i++)
        {
            System.out.println(two.getNext());
        }

    }
}
