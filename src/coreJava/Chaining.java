package coreJava;

/**
 * Created by DD on 2017-11-12.
 */
public  class Chaining {

    public static void main(String[] args) {

        Chaining ch = new Chaining().name("Frank").nazw("Underwood");
        Chaining ch2 = new Chaining().name("WWW");
                ch.email("www");
        rok("1995");
    }

    public static void rok(String year){
        System.out.println(year);
    }


    public void email(String email){
        System.out.println(email);

    }

    public Chaining name(String imie){
        System.out.println(imie);
        return this;
    }

    public Chaining nazw(String nazw){
        System.out.println(nazw);
        return this;
    }
}
