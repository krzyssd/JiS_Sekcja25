package coreJava;

/**
 * Created by DD on 2017-11-01.
 */
public class childDemo extends parentDemo {

    String name ="My nam in childDemo";

    public childDemo(){
        super(); //this should be always be at first line
        System.out.println("child class constructor");
    }


    public void getStringdata(){
        System.out.println(name);
        System.out.println(super.name);

    }


    public void getData() {
        super.getData();
        System.out.println("I am child class");
    }

    public static void main(String[] args) {

        childDemo cd = new childDemo();
        cd.getStringdata();
        cd.getData();

    }
}

