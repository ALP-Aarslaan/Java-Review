import java.util.Scanner;

public class $_15_1_far_to_cel {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double fahrenheit,celsius;
        System.out.println("enter temperature in fahrenheit:");
        fahrenheit=scan.nextDouble();
        celsius=(5*(fahrenheit-32))/9;
        System.out.println("temperature in celsius:"+celsius);
    }
}
