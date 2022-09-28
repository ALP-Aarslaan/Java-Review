import java.util.Scanner;

public class $_15_temperature_converter {
    public static void main(String[] args) {
        float  cel,temperature;
        System.out.println("Enter temperature in Celsius:");
        Scanner scan=new Scanner(System.in);
        cel=scan.nextFloat();
        temperature=((9*cel)/5)+32;
        System.out.println("temperature in fahrenheit:"+temperature);
    }
}
