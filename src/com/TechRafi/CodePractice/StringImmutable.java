package com.TechRafi.CodePractice;

public class StringImmutable {
    public static void main(String[] args) {
        String name= "Rafi";
        System.out.println(name.hashCode());
        name= "Rafiq";
        System.out.println(name);
        System.out.println(name.hashCode());
    }
}
