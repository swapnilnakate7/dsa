import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class DateUtil {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat= new SimpleDateFormat("");


        Date date1 = new Date();
        Date date2 = new Date();

       long difference = date2.getTime() - date1.getTime(); // Difference in milliseconds
       double hours = difference/(1000.0*3600); // ((difference / 1000) {difference in seconds})/(3600) {divide to convert into hours}
    }
}
