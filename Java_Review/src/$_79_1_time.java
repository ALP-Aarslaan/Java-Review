import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class $_79_1_time {
    public static void main(String[] args) {
        LocalTime time=LocalTime.now();
        System.out.println(time);
        DateTimeFormatter t=DateTimeFormatter.ofPattern("hh:mm");
        String time1=t.format(time);
        System.out.println(time1);
    }
}
