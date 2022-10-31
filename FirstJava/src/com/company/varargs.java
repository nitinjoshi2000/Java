package com.company;

public class varargs {

    static double average(int... a)
    {
        //Average Of 'n' numbers
        int n = a.length;
        int sumOfNumbers = 0;

        //Calculating sum of numbers
        for(int i : a)
        {
            sumOfNumbers = sumOfNumbers + i;
        }
        return (sumOfNumbers/n);
    }


/*
    static int sum(int ...arr){
        int result=0;
        for (int a: arr){
            result += a;
        }
        return result;
    }
*/


    public static void main(String[] args) {
        System.out.println("The average is: " + average(4,5));
        System.out.println("The average is: " + average(5,5));
    }
}
