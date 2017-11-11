package coreJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by DD on 2017-11-09.
 */
public class hashMapexample {

    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        hm.put(0, "heelloo");
        hm.put(1, "morning");
        hm.put(2, "evening");
        hm.put(3, "goodnigt");

        String a = hm.get(222);
        System.out.println(a);

        Set sn  = hm.entrySet();
        Iterator<Map.Entry> it = sn.iterator();

        while(it.hasNext()){
            it.next();
            Map.Entry mp = (Map.Entry) it.next();
            System.out.println(mp.getValue());
        }




    }
}
