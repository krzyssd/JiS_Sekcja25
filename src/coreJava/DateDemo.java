package coreJava;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by DD on 2017-11-01.
 */
public class DateDemo {

    public static void main(String[] args) {

        String time;

        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
        SimpleDateFormat sd = new SimpleDateFormat("M/dd/yyyy hh:mm:ss");
        time = d.toString();
        System.out.println(time);

        System.out.println(d);
        System.out.println(sdf.format(d));
        System.out.println(sd.format(d));


        //mm/dd/yyyy HH:MM:SS





    }

}
