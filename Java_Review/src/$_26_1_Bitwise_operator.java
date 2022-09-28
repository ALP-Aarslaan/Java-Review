import java.util.Scanner;

public class $_26_1_Bitwise_operator {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int a,b;
        System.out.println("enter any number:");
        a=scan.nextInt();
        b=scan.nextInt();
        int c=a&b;
        int d=a^b;
        int e=a|b;
        int f=a>>3;
        int g=a<<3;
        System.out.println("a & b:"+c);
        System.out.println("a ^ b:"+d);
        System.out.println("a | b:"+e);
        System.out.println("a>>3:"+f);
        System.out.println("a<<3:"+g);

    }
}
