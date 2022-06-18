package com.TechRafi.CodePractice;

public class FloyedTriangle {
    public static void main(String[] args) {
        int n=5;
        int num=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(++num+" ");
            }
            System.out.println();
        }
    }
}
