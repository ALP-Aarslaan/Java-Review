import java.util.Scanner;

public class $_12_1_Arithmetic_Operator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double x,y;
        System.out.println("enter two number:");
        x=scan.nextDouble();
        y=scan.nextDouble();
        double sum=x+y;
        double sub=x-y;
        double mul=x*y;
        double div=x/y;
        double mod=x%y;
        System.out.println("total sum:"+sum);
        System.out.println("total sub:"+sub);
        System.out.println("total multiplication:"+mul);
        System.out.println("total division:"+div);
        System.out.println("total modulus:"+mod);


    }
}
