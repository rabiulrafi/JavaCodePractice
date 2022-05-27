package com.TechRafi;

import java.util.Scanner;

public class primeTest {
    public static void main(String[] args) {
        int n,c;

        while(true){
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            c = 2;
            for (c = 2; c <= Math.sqrt(n)+1; c++) {
                if (n % c == 0) {
                    System.out.println("Not a prime");
                    break;
                }

            } 

                if(c == n) {
                    System.out.println("Prime");
                }

        }
    }
}