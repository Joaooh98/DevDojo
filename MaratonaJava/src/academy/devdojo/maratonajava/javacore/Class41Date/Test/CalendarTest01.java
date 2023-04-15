package academy.devdojo.maratonajava.javacore.Class41Date.Test;

import java.util.Date;
import java.util.Calendar;

public class CalendarTest01 {
    public static void main(String[] args) {
        
        Calendar c = Calendar.getInstance(); 
        Date date = new Date();

        if (c.getFirstDayOfWeek() == Calendar.SUNDAY) {
            System.out.println("domigão");
        }
        System.out.println(c.get(Calendar.DAY_OF_WEEK)); 
        System.out.println(c.get(Calendar.DAY_OF_MONTH)); 
        System.out.println(c.get(Calendar.DAY_OF_YEAR)); 
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println(c.get(Calendar.HOUR)); 

        c.add(Calendar.DAY_OF_MONTH, 2);
        c.add(Calendar.HOUR, 10);

        date.getTime();
        System.out.println(date); 
    }
}
