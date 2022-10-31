package com.company;

class Employee{
    int id;
    String name;
    public void printDetails(){
        System.out.println("My id is "+id);
        System.out.println("My name is "+ name);
    }
}

public class custom_class {
    public static void main(String[] args) {
        System.out.println("THis is our custom class");
        Employee nitin = new Employee();

//      Setting Attributes
        nitin.id = 10;
        nitin.name = " nitin joshi";

//      Printing the Attributes
//        System.out.println(nitin.id);
//        System.out.println(nitin.name);

        nitin.printDetails();
    }
}
