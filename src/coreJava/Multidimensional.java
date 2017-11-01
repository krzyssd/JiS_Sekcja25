package coreJava;

/**
 * Created by DD on 2017-10-29.
 */
public class Multidimensional {

    public static void main(String[] args) {

        int a[][] = new int [2][3];

        a[0][0] = 1;
        a[0][1] = 3;
        a[0][2] = 10;
        a[1][0] = 5;
        a[1][1] = 6;
        a[1][2] = 15;
       // a[3][0] = 30;
       // a[3][1] = 31;
       // a[3][2] = 32;
        //int b[][] = {{1,3,4},{1,3,5}};


       // System.out.println(a[1][0]);
        System.out.println(a[0].length);
        System.out.println(a[1].length);

        for (int r= 0; r<2; r++){

            for (int col = 0; col<3; col++){

                System.out.println(a[r][col]);
            }
        }
        for (int r= 0; r<a[0].length; r++){

            for (int col = 0; col<a[1].length; col++){

                System.out.println(a[r][col]);
            }
        }


    }

}

public class Hello{

    public static void main(String[] args) {
        for(int i=1; i<=10; i++){
            System.out.println("Hello world..." +i)
        }

    }
}