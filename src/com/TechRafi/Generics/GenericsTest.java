package com.TechRafi.Generics;

public class GenericsTest {
    public static void main(String[] args) {
        Printer<Integer,String> a= new Printer<Integer,String>(12,"Rafi");
        Printer<Double,String> b= new Printer<>(12.2,"Roil");
        a.print();
        b.print();
    }
}
