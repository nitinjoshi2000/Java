package com.company;

class Thread1 extends Thread{
    @Override
   public void run(){
        int i = 0;
        while(i<40){
            System.out.println("I am Thread1");
            System.out.println("I am bad");
            i++;
        }
   }
}

class Thread2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i<40){
            System.out.println("I am Thread2");
            System.out.println("I am good");
            i++;
        }
    }
}

public class Multitherading {
    public static void main(String[] args) {
        Thread t1 = new Thread1();
        Thread t2 = new Thread2();
        t1.start();
        t2.start();

    }
}
