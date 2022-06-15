package com.TechRafi;

public class GCD {
    public static void main(String[] args) {
        int n1=7, n2=9;

        while(n1!=n2){
            if(n1>n2){
                n1=n1-n2;
            }
            else
                n2=n2-n1;
//            System.out.println(n1+""+n2);
        }
        System.out.println(n2);
    }
}
