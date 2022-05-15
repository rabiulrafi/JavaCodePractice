package com.TechRafi;

public class Fibonacci {
    public static void main(String[] args) {
        int n=10;
        int a=0,b=1,temp;

        for(int i=1;i<=n;i++){
            if(n>1){
                System.out.print(b+" ");
                temp=b;
                b=a+b;
                a=temp;
            }
        }
    }
}