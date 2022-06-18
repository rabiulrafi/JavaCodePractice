package com.TechRafi.CodePractice;
import java.util.Scanner;

public class primeTest {

    public static void main(String[] args) {
        int number,c;

        while(true){
            Scanner sc = new Scanner(System.in);
            number = sc.nextInt();
            for(int i=2;i<number;i++){
                while(number%i==0){
                    System.out.print(i+" ");
                    number=number/i;
                }
            }
            if(number>2){
                System.out.println(number);
            }
        }
    }
}