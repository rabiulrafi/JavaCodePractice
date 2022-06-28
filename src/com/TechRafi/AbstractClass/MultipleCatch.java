package com.TechRafi.AbstractClass;

public class MultipleCatch {

    public static void main(String[] args) {
        try{
            int a[]= {3,4,5};
            System.out.println(10/0);
            System.out.println(a[5]);

          }
        catch(ArithmeticException e)  {
            System.out.println("Arithmetic Exception occurs");  }
        catch(ArrayIndexOutOfBoundsException e)   {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");   }
        catch(Exception e)   {
            System.out.println("Parent Exception occurs");  }
        System.out.println("rest of the code");
    }
}

