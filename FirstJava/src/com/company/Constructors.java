package com.company;

class Employee1{
    private int id;
    private String name;

//    public Employee1(){
//        id =45;
//        name = "Your-name-here";
//    }

    public Employee1(String myName, int myId){
        id = myId;
        name = myName;
    }

    public void setName(String n){ this.name = n; }
    public String getName() { return name; }
    public void setId(int i){ this.id = i; }
    public int getId(){ return id; }
}
public class Constructors {
    public static void main(String[] args) {
        Employee1 nitin = new Employee1("nitin",20);
//        nitin.setName("Nitin");
//        nitin.setId(280);
        System.out.println(nitin.getId());
        System.out.println(nitin.getName());
    }
}
