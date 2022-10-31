package com.company;

abstract class Parent{
    public Parent(){
        System.out.println("I am constructor of base");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet1();
    abstract public void greet2();
}

class Child1 extends Parent {
    @Override
    public void greet1() {
        System.out.println("Good Morning");
    }

    @Override
    public void greet2() {
        System.out.println("Good Afternoon");
    }
}

    abstract class Child2 extends Parent {
        public void th() {
            System.out.println("I am good");
        }
    }

    public class Abstract {
        public static void main(String[] args) {
//            Parent p = new Parent();  --error
            Child1 c = new Child1();
//            Child2 c2 = new Child2();   --error
        }
    }
