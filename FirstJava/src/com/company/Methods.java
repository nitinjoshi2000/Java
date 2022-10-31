package com.company;

public class Methods {

    static void foo(){
        System.out.println("Hello Guys!");
    }

    static void foo(int a){
        System.out.println("The Number is! " + a);
    }

    static void foo(int a, int b){
        System.out.println("The Number is " + a);
        System.out.println("The Number is " + b);
    }

    static void change(int a){
        int x = 50;
    }

    static void change1(int [] arr){
        arr[0] = 90;
    }

    static void tellJoke(){
        System.out.println("I invented a new word\n" +
                "Plagiarism!");
    }
    public static void main(String[] args) {
//        tellJoke();

//      Changing the integer
        int x = 80;
        change(x);
        System.out.println("The value of x after running change is: " + x);

//      Changing the Array
        int [] marks= {50,60,70,80,90};
        change1(marks);
        System.out.println("The value of arr[0] after running change is: " + marks[0] );

        //    Method Overloading
        foo();

        foo(300);

        foo(400, 500);

//        Method Overloading cannot be performed changing return typ e.

    }
}
