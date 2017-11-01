package InterfaceConcept;

/**
 * Created by DD on 2017-10-28.
 */
public class Developing implements Domainclient,Bankingclient {


    public static void main(String[] args) {
        Developing d = new Developing();
        d.checkingbalanc();
        d.paycreditcard();
        d.login();

        Bankingclient dr = new Developing();



    }

    @Override
    public void paycreditcard() {
        System.out.println("paycredit implemented");

    }

    @Override
    public void checkingbalanc() {
        System.out.println("chekingbalanc implemented");

    }

    @Override
    public void investment() {

    }

    public void login(){
        System.out.println("Login balance implemented");


    }

}
