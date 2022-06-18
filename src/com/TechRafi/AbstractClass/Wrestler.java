package com.TechRafi.AbstractClass;

public abstract class Wrestler {

    public abstract void themeMusic();
    public abstract void finisher();
    public void HourOfPayment(int hour){
        System.out.println("Total Payment($500/per): "+ hour*500);
    }
}
