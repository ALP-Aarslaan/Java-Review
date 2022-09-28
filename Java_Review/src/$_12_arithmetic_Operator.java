import java.util.Scanner;

public class $_12_arithmetic_Operator {
    public static void main(String[] args) {
        int x,y;
        System.out.println("enter two numbers:");
        Scanner scan=new Scanner(System.in);
        x=scan.nextInt();
        y=scan.nextInt();
        int sum=x+y;
        System.out.println("total sum="+sum);
        int sub=x-y;
        System.out.println("total sub="+sub);
        int mul=x*y;
        System.out.println("total multiplication:"+mul);
        double div= ((double)x/y);
        System.out.println("total division:"+div);
        int mod=x%y;
        System.out.println("modulus:"+mod);
    }
}
