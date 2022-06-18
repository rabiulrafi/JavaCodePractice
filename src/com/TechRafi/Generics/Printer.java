package com.TechRafi.Generics;

class Printer<T,U> {
    T thingToPrint;
    U obj;

    public Printer(T thingToPrint, U obj) {
        this.thingToPrint = thingToPrint;
        this.obj = obj;
    }

    public void print(){
        System.out.println(thingToPrint+" "+obj);
    }
}