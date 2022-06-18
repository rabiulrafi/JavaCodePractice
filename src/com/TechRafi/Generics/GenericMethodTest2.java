package com.TechRafi.Generics;
class GenericMethodTest2 {
    static <T> void genericDisplay(T element)
    {
        System.out.println(element);
    }
    public static void main(String[] args)
    {
        genericDisplay(20);
        genericDisplay("Hey Im Generic Method");
        genericDisplay(1.0);
    }
}

