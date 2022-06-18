package com.TechRafi.CodePractice;

public class HalfPyramidNumber {
    public static void main(String[] args) {
        int n=6, m=5;
//        for(int i=1;i<=n;i++){
//            for(int j=1; j<=i;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
        //Inverted Half pyramid
        for(int i=n;i>=1;i--){
            for(int j=1; j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
