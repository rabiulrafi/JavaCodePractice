package com.TechRafi;

public class Pyramid {
    public static void main(String[] args) {
        int n=4,m=5;
        for(int i=1;i<=n;i++){
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
