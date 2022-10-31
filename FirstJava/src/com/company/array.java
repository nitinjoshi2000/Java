package com.company;

public class array {
    public static void main(String[] args) {

//      1.Declaration and memory allocation
        /*
        int [] marks =  new int[5];
        marks[0] = 100;
        marks[1]= 50;
        marks[2]= 60;
        marks[3]= 70;
        marks[4]= 80;
        System.out.println(marks[4]);
         */


//      2. Declaration and then memory allocation
        /*
        int [] marks;
        marks = new int[5];

        marks[0] = 100;
        marks[1]= 50;
        marks[2]= 60;
        marks[3]= 70;
        marks[4]= 80;
        System.out.println(marks[4]);
        */

//      3.Declaration ,memory allocation and initialization together
        /*
        int [] marks ={60,70,80,100,90};
        System.out.println(marks[3]);
         */

//      Displaying the array by using for-loop
//        int [] marks ={60,70,80,100,90};
//        for(int i=0; i<marks.length;i++){
//            System.out.println(marks[i]);
//        }

//      Displaying the array in reverse order by using for-loop
        /*
        int [] marks ={60,70,80,100,90};
        for(int i=marks.length -1; i>=0;i--){
            System.out.println(marks[i]);
        }
         */



//      Displaying the array by using for-each loop
//        int [] marks ={60,70,80,100,90};
//        for(int elements: marks){
//            System.out.println(elements);
//        }

//      Multidimensional Array
        int [] marks;
        int [][] flats;
        flats = new int[2][3];
        flats[0][0] =101;
        flats[0][1] =102;
        flats[0][2] =103;
        flats[1][0] =201;
        flats[1][1] =202;
        flats[1][2] =203;

        System.out.println("Printing 2-D array using for loop");
        for(int i=0;i<flats.length;i++){
            for(int j=0;j<flats[i].length;j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }






    }

}
