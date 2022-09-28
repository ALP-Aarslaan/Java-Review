import java.util.Scanner;

public class $_10_1_how_to_get_user_input {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s;
        System.out.println("enter your name:");
        s=scan.nextLine();
        System.out.println(s);
        float f;
        System.out.println("enter a number:");
        f=scan.nextFloat();
        System.out.println(f);
    }
}
