package com.TechRafi.Generics;

public class GenericMethodTest {
    public static<E> void PrintArray(E[] a){
        for(E i:a){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        Integer[] intArr={1,2,3,4,5};
        Double[] doubleArr = {1.2,3.4,5.6,4.4,3.4};
        Character[] charArr = {'a','b','c','d'};
        System.out.println("Integer Array Contains: ");
        PrintArray(intArr);
        System.out.println("\nDouble Array Contains: ");
        PrintArray(doubleArr);
        System.out.println("\nCharacter Array Contains: ");
        PrintArray(charArr);

    }
}
