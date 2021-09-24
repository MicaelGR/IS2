package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {
    private final String name;
    private final Calendar birthdate;
    
    public Person(String name, Calendar date) {
        this.name = name;
        this.birthdate = date;
    }
    
    public int getAge() {
        Calendar now = GregorianCalendar.getInstance();
        return (int) (MillisecondsPerYear(now.getTimeInMillis()-birthdate.getTimeInMillis()));
    }
    
    private int MillisecondsPerYear(long l) {
        final long milliseconds_per_year = (long) (365.25*24*60*60*1000L);
        return (int) (l/milliseconds_per_year);
    }
    
    public String getName() {
        return this.name;
    }
    
}
