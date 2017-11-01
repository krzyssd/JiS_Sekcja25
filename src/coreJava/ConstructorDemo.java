package coreJava;

/**
 * Created by DD on 2017-11-01.
 */
public class ConstructorDemo {

    public ConstructorDemo(){
        System.out.println("I am constructor");

    }

    public ConstructorDemo(int a, int b){
        System.out.println("I am constructor with a and b");

    }

    public ConstructorDemo(String text){
        System.out.println(text);

    }

    public void getData(){
        System.out.println("I am the method");
    }


    public static void main(String[] args) {
        String s = "I am a constructor";
        ConstructorDemo cd = new ConstructorDemo(s);
        cd.getData();

        ConstructorDemo cd1 = new ConstructorDemo(5,6);

    }








}
