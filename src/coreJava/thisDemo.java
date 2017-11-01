package coreJava;

/**
 * Created by DD on 2017-11-01.
 */
public class thisDemo {
    int a = 2;

    public void getData(){
        int a =3;
        int b = a + this.a;
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(b);
    }


    public static void main(String[] args) {

        thisDemo td = new thisDemo();
        td.getData();

    }
}
