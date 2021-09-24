package kata1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Kata1 {

    public static void main(String[] args) {
        Calendar birthdate = GregorianCalendar.getInstance();
        birthdate.set(1980, 1, 1);
        Person p1 = new Person("Antonio", birthdate);
        System.out.println(p1.getName() + " tiene: " + p1.getAge());
        
    }
    
}
