package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {

//    Calling method
    static int sum(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello World");

    /*
        int a = 45;
        float b = 45.22f;
        System.out.println(a);
        System.out.println(b);

     */


    /* Rules for constructing name of variables in Java
      1. Can contain digits, underscores, dollar signs, letters
      2. Should begin with a letter, $ or _
      3. Java is case sensitive language which means that nitin and Nitin are two different variables altogether.
      4. Should not contain whitespace
      5. You cannot use reserved keywords from Java

     */

    /*
     Two types of data types:-
     1.Primitive Data Type
     2.Non- Primitive Data Type
     */
//        byte u = -56;
//        System.out.println(u);
//        char grade = 'A';
//        System.out.println(grade);

//  Operators in Java

//  String Methods
       /* String name= "Nitin";
        System.out.println(name);
        System.out.println(name.contains("Nit"));
        System.out.println(name.charAt(3));
        System.out.println(name.endsWith("in"));
        */


//  Taking user input in Java
       /* Scanner scan = new Scanner(System.in);
        System.out.println("Enter Age");
        int age = scan.nextInt();
//        System.out.println("Your age is " + input);
//  If-else Conditionals
        if(age>5){
            System.out.println("You are a adult");
        }else{
            System.out.println("You are a kid");
        }

        */

//  Practice

        /*Scanner sca = new Scanner(System.in);
        System.out.println("Enter  number");
        int num = sca.nextInt();

        switch (num){
            case 1:
                System.out.println("Today is Sunday");
                break;
            case 2:
                System.out.println("Today is Monday");
                break;
            case 3:
                System.out.println("Today is Tuesday");
                break;
            case 4:
                System.out.println("Today is Wednesday");
                break;
            case 5:
                System.out.println("Today is Thursday");
                break;
            case 6:
                System.out.println("Today is Friday");
                break;
            case 7:
                System.out.println("Today is Saturday");
                break;

            default:
               System.out.println("Any number does not exist");
        }*/

//  Loops
        /*
        int i =0;
        while(i<100) {
            System.out.println(i);
            i += 1;
        }*/

//  Java Arrays
        /*
        int [] marks = {1,2,3,4};
        marks[3] = 34;
        System.out.println(marks[0]);
        System.out.println(marks[3]);
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
         */
//  String Array
        /*
        String [] cars= {"Tyota","Maruti","BMW"};
        for (String value:cars) {
            System.out.println(value);
        }
         */
//  Try-catch
        /*
        String [] cars= {"Tyota","Maruti","BMW"};
        try{
            System.out.println(cars[4]);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Masoom");
         */

//        Method calling from top
//        System.out.println(sum(5, 7));

//  Mini Calculator Project
        /*
        float number_1, number_2;
        System.out.println("Enter first number");

        Scanner scan = new Scanner(System.in);
        number_1 = scan.nextFloat();

        System.out.println("Enter second number");
        number_2 = scan.nextFloat();
        System.out.print("You have Entered ");
        System.out.print(number_1);
        System.out.print(" and ");
        System.out.println(number_2);
         String prompt =  "Enter 0 for addition, 1 for" +
                         " subtraction, 2 for multiplication, 3 for division";
        System.out.println(prompt);
        int input = scan.nextInt();
        switch (input){
            case 0:
                System.out.println("Adding these numbers");
                System.out.print("The result is: ");
                System.out.println(number_1 + number_2);
                break;

            case 1:
                System.out.println("Subtracting these numbers");
                System.out.print("The result is: ");
                System.out.println(number_1 - number_2);
                break;

            case 2:
                System.out.println("Multiplying these numbers");
                System.out.print("The result is: ");
                System.out.println(number_1 * number_2);
                break;

            case 3:
                System.out.println("Dividing these numbers");
                System.out.print("The result is: ");
                System.out.println(number_1 / number_2);
                break;

            default:
                System.out.println("Command not found");
        }*/



    }
}
