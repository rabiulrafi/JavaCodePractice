package com.TechRafi.Generics;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> a= new ArrayList<String>();

        a.add("Bill");
        a.add("Clinton");
        a.add("Rill");
        System.out.println(a.get(0));
    }
}
