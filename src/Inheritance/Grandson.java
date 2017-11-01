package Inheritance;

/**
 * Created by DD on 2017-10-28.
 */
public class Grandson extends Son {

    public static void main(String[] args) {

        Grandfather gs = new Son();
        gs.city();



    }


    @Override
    public void city() {
        System.out.println("Miasto Gransona");
    }
}
