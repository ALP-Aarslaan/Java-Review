import java.util.Scanner;

public class $_14_area_Of_Circle {
    public static void main(String[] args) {
        double pi=3.1416,r;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter radius:");
        r=scan.nextDouble();
        double result=pi*Math.pow(r,2);
        System.out.println("area of circle:"+result);
    }
}
