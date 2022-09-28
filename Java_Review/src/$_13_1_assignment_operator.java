import java.util.Scanner;

public class $_13_1_assignment_operator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double x,y;
        System.out.println("enter two number:");
        x=scan.nextDouble();
        y=scan.nextDouble();
        x+=y;//x=x+y;
        System.out.println("x:"+x);
        x-=y;//x=x-y;
        System.out.println("x:"+x);
        x*=y;//x=x*y;
        System.out.println("x:"+x);
        x/=y;//x=x/y;
        System.out.println("x:"+x);
        x%=y;//x=x%y;
        System.out.println("x:"+x);

    }
}
