
public class $_102_2_callByReference{
    public static void main(String[] args) {
    practice p1=new practice();
    p1.length=10;
    p1.display(p1);
        System.out.println(p1.length);
    }
}
class practice{
    int length;
    public void display(practice p2) {
        p2.length=20;
    }
}
