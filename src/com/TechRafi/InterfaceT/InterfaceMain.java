package com.TechRafi.InterfaceT;

public class InterfaceMain {
    public static void main(String[] args) {
        Wrestler kane = new Kane();
        Wrestler jhon= new Jhonsina();
        kane.themeMusic();
        kane.finisher();
        kane.HourOfPayment(10);
        jhon.themeMusic();
        jhon.finisher();
        jhon.HourOfPayment(10);
    }
}
