import java.util.Scanner;

public class $_25_Conditional_operator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter two numbers:");
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        int large=(num1>num2)?num1:num2;
        System.out.println("large number is:"+large);
    }
}
