package com.company;

public class Recursion {
//    Factorial(0) = 1
//    Factorial(n) = n * n-1 *.....1
    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else {
            return n * factorial(n-1);
        }
    }

    public static void main(String[] args) {
        int x=5;
        System.out.println("The value of factorial is: " + factorial(x));

    }
}
