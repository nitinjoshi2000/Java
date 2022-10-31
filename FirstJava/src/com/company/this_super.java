package com.company;

class EkClass {
    int a;

    public int getA() {
        return a;
    }

    EkClass(int a) {
        this.a = a;
    }

    public int returone() {
        return 1;
    }
}
    class DoClass extends EkClass {
        DoClass(int c) {
            super(c);
            System.out.println("Hello");
        }
    }

public class this_super {
    public static void main(String[] args) {
        EkClass e = new EkClass(4);
        DoClass b = new DoClass(10);
        System.out.println(e.getA());
        System.out.println(b.getA());

    }
}
