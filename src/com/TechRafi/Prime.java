package com.TechRafi;
import java.util.Scanner;
public class Prime {
    public static void prime(int m){
        for(int i=1;i<=m;i++) {
            int  c=2;
            for (c = 2; c <= i - 1; c++) {
                if (i % c == 0) {
                    break;
                }
            }
            if (c == i) {
                System.out.print(i+' ');
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        prime(n);
    }
}
