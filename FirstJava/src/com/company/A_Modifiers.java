package com.company;

class MyEmployee{
    private int id;
    private String name;

    public void setName(String n) { this.name = n; }
    public String getName() { return name; }
    public void setId(int i){ this.id = i; }
    public int getId(){ return id; }
}

public class A_Modifiers {
    public static void main(String[] args) {
        MyEmployee nitin = new MyEmployee();
        nitin.setName("Nitin Joshi");
        System.out.println(nitin.getName());
        nitin.setId(200);
        System.out.println(nitin.getId());

    }
}
