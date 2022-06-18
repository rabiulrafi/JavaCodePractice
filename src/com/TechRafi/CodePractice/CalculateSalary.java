package com.TechRafi.CodePractice;

import java.util.Scanner;

class EmployeeDetails{
    private String employeeName;
    private String designation;
    private double salary;
    private double netSalary;

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setDesignation(String designation) {

        this.designation = designation;
    }

    public void setNetSalary(double netSalary) {
        this.netSalary = netSalary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getDesignation() {
        return designation;
    }

    public double getSalary() {
        return salary;
    }

    public double getNetSalary() {
        if(getDesignation().equals("Programmer")){
            netSalary= salary+salary*.30d;
        }
        else if(getDesignation().equals("Jn. Programmer"))
        {
            netSalary= salary+salary*.50d;
        }
        else if(getDesignation().equals("Associate Programmer")){
            netSalary= salary+salary*.80d;
        }

        return netSalary;
    }
}

public class CalculateSalary {
    public static void main(String[] args) {

        for(int i=0;i<3;i++){
            Scanner sc= new Scanner(System.in);
            EmployeeDetails emp= new EmployeeDetails();
            System.out.println("Enter Name:");
            emp.setEmployeeName(sc.nextLine());
            System.out.println("Chose Designation\n1.Programmer\n2.Associate Programmer\n3.Jn. Programmer");

            switch (sc.nextInt()) {
                case 1 -> emp.setDesignation("Programmer");
                case 2 -> emp.setDesignation("Associate Programmer");
                case 3 -> emp.setDesignation("Jn. Programmer");
                default -> throw new IllegalArgumentException("Invalid Input");
            }
            System.out.println("Enter salary:");
            emp.setSalary(sc.nextDouble());
            System.out.println("Employee Name: "+ emp.getEmployeeName());
            System.out.println("Employee Designation: "+emp.getDesignation());
            System.out.println("Employee Salary: "+ emp.getSalary());
            System.out.println("Employee Net salary With Eid Bonus: "+emp.getNetSalary());
        }
    }
}
