import java.util.Scanner;

public class $_17_1_relational_operator {
    public static void main(String[] args) {
        int a,b;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter two numbers:");
        a=scan.nextInt();
        b=scan.nextInt();
        boolean c=(a<b);
        System.out.println("c="+c);
        c=(a<=b);
        System.out.println("c="+c);
        c=(a==b);
        System.out.println("c="+c);
        c=(a!=b);
        System.out.println("c="+c);
        c=(a>b);
        System.out.println("c="+c);
        c=(a>=b);
        System.out.println("c="+c);

    }
}
