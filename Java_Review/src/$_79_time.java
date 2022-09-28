import java.sql.Time;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class $_79_time {
    public static void main(String[] args) {
        LocalTime time=LocalTime.now();
        System.out.println(time);
        DateTimeFormatter time1=DateTimeFormatter.ofPattern("hh:mm");
        String s=time.format(time1);
        System.out.println(s);


    }
}
