package com.TechRafi.InterfaceT;

public class Jhonsina implements Wrestler {
    @Override
    public void themeMusic() {
        System.out.println("Jhon theme Music");
    }

    @Override
    public void finisher() {
        System.out.println("Jhon the ripper");

    }

    @Override
    public void HourOfPayment(int hour) {
        System.out.println("Total payment( $500/hour) :"+ hour);
    }
}
