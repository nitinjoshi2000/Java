package com.company;

class Base {
    int x;
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
        System.out.println("I am in base and Setting up X now");
    }

}
class Derived extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class Inheritance {
    public static void main(String[] args) {
    Base b = new Base();
    b.setX(4);
    System.out.println(b.getX());

//    Derived class
    Derived d = new Derived();
    d.setY(44);
    System.out.println(d.getY());
    }
}
