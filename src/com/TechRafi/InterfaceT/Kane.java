package com.TechRafi.InterfaceT;
public class Kane implements Wrestler{
    @Override
    public void themeMusic() {
        System.out.println("Kane theme music");
    }
    @Override
    public void finisher() {
        System.out.println("Kane the finisher");
    }
    @Override
    public void HourOfPayment(int hour) {
        System.out.println("Total hour of payment (700$/hour): "+hour);
    }
}
