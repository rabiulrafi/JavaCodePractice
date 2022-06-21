package com.TechRafi.AbstractClass;

public class AbstractMain {
    public static void main(String[] args) {
        Wrestler kane= new Kane();
        Wrestler jhon = new JhonSina();
        kane.themeMusic();
        kane.finisher();
        kane.HourOfPayment(5);
        jhon.themeMusic();
        jhon.finisher();
        jhon.HourOfPayment(7);
    }
}
