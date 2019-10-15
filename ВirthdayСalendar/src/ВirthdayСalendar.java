import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class ВirthdayСalendar {
    public static void main(String[] args) {

        Calendar calendar = new GregorianCalendar();
        calendar.set(1986, Calendar.FEBRUARY, 8);
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy - EE", Locale.ENGLISH);

        Calendar presently = new GregorianCalendar();
        for (int i = 0; calendar.before(presently); i ++){
            System.out.println(i + " - " + dateFormat.format(calendar.getTime()));
            calendar.add(Calendar.YEAR,1);
        }
    }
}
