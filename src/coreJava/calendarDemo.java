package coreJava;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.time.*;
import static java.util.Calendar.*;
/**
 * Created by DD on 2017-11-01.
 */
public class calendarDemo {

    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sd= new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
        System.out.println(sd.format(cal.getTime()));


        Calendar.getInstance().get(Calendar.DAY_OF_MONTH);

        //Calendar cal2 = new Calendar.Builder();
        Calendar cal3 = new Calendar.Builder().setCalendarType("japanese")
                .setFields(YEAR, 1, DAY_OF_YEAR, 1).build();





    }
}
