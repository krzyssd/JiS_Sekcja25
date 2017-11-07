package coreJava;

import java.util.ArrayList;

/**
 * Created by DD on 2017-11-04.
 */
public class arrayListexample {
    //ArrayList, LInkedlist,vector, implementing list inferface can accept duplicate value
    //array have fixed size where as arraylist can grow dinamic
    //you c


    public static void main(String[] args) {


        ArrayList<String> a = new ArrayList<String>();
        a.add("lalala");
        a.add("Java");
        a.add(0, "student");
        System.out.println(a);
        //a.remove("Java");
        boolean check = a.contains("Java");
        System.out.println(check);
        System.out.println("Index lalala to " + a.indexOf("lalala"));
        System.out.println("Is the index empty? " + a.isEmpty());
        System.out.println("Size of Arralist  " + a.size());


    }
}
