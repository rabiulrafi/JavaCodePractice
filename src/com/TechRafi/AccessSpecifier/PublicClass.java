package com.TechRafi.AccessSpecifier;

class Data {
    private String name;

    // getter method
    public String getName() {
        return this.name;
    }
    // setter method
    public void setName(String name) {
        this.name= name;
    }
}

public class PublicClass {
    public static void main(String[] args) {

        Data d= new Data();
        d.setName("Rafi");

        System.out.println(d.getName());

    }
}
