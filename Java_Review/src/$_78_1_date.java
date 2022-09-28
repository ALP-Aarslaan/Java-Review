import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class $_78_1_date {
    public static void main(String[] args) {
        Date date=new Date();
        System.out.println(date);
        DateFormat d1=new SimpleDateFormat("dd/MM/yyyy");
        String d=d1.format(date);
        System.out.println(d);
    }
}
