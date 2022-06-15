package com.TechRafi.Encapsulation;

public class CarMain {
    public static void main(String[] args) {
        Car car1= new Car("Bx","FXX-1",2020);
        Car car2= new Car(car1); //Copy Constructor

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car2.getName());
    }
}
