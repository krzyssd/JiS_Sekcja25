package coreJava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by DD on 2017-11-07.
 */
public class hashSetexample {

    public static void main(String[] args) {

        //Hashset treeser linkedHashset implements Set interface
        //Set interface does not accept duplicate values -> omit duplicate
        // There is no quarantee elements stored in sequential order


        HashSet<String> hs = new HashSet<String>();
        hs.add("111");
        hs.add("222");
        hs.add("333");
        hs.add("333");
        hs.add("he");
        hs.add("SHE");
        boolean e  = hs.isEmpty();
        int s = hs.size();


        System.out.println(hs);

        System.out.println("Is empty ?? Answer: " + e);
        System.out.println("Size is " + s);

// po nexcie moze wyskorzyc dowolna wartosc poniewaz jak wczesniej napisano nie ma
        //gwarancji miejsca niemniej jednak przeiterowac sie da po wszystkich wartosciach s26 w243

        Iterator<String> i = hs.iterator();
  //      System.out.println(i.next());
    //    System.out.println(i.next());

        //has Next sprawdza czy kolejny next jest prezentowany jesli tak zwraca true

        while(i.hasNext()){
            System.out.println(i.next());
        }







    }

}
