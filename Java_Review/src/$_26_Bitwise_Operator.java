import java.util.Scanner;

public class $_26_Bitwise_Operator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a,b;
        System.out.println("enter two numbers:");
        a=scan.nextInt();
        b=scan.nextInt();
        int c=a&b;
        System.out.println("a & b :"+c);
        c=a|b;
        System.out.println("a | b :"+c);
        c=a^b;
        System.out.println("a ^ b :"+c);
        c=a>>b;
        System.out.println("a>>b:"+c);
        c=a<<b;
        System.out.println("a<<b:"+c);
    }
}
