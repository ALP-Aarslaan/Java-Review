import java.util.Scanner;

public class $_14_area_of_a_triangle {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double height,base;
        System.out.println("enter height:");
        height=scan.nextDouble();
        System.out.println("enter base:");
        base=scan.nextDouble();
        double result=(double)1/2*base*height;
        System.out.println("area of triangle:"+result);
        double r ;
        System.out.println("enter radius:");
        r=scan.nextDouble();
        double value=Math.PI*(r*r);
        System.out.println("area of circle:"+value);
    }
}
