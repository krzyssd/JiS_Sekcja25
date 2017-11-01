package com.company;

/**
 * Created by DD on 2017-10-28.
 */
public class reversedemo {

    public static void main(String[] args){

        String s = "odwrot";
        String sa = "";

        for (int i = s.length()-1; i>=0; i--){

            sa = sa + s.charAt(i);
            System.out.println(s.charAt(i));

        }

        System.out.println(sa);








    }


}
