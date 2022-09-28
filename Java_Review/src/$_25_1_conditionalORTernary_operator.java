import java.util.Scanner;

public class $_25_1_conditionalORTernary_operator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter two numbers:");
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        int small=(num1<num2)?num1:num2;
        System.out.println("smaller number is:"+small);
    }
}
