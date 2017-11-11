package coreJava;

/**
 * Created by DD on 2017-10-29.
 */
public class ArraysDemo {


    public static void main(String[] args) {

        int a = 4;

        int b[] = {1,2,3,4,5};

        int c [] = new int[5]; // Declares an array and allocates memory for values

        String d [] = new String [10];
        c[0] = 2;
        c[1] = 3;
        c[2] = 0;
        c[3] = 7;
        c[4] = 14;
        c[0] = 1;


        int e[] = {1,3,4,5,6};


        for (int x = 0; x<c.length; x++){

            System.out.println(c[x]);
        }

        for (int x : c){

            System.out.println(x);



        }








    }



}
