import java.util.Scanner;

public class $_37_factorial {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n,fact=1;
        System.out.println("enter any positive integer:");
        n=scan.nextInt();
        for(int i=n;i>=1;i--){
            fact=fact*i;
            System.out.print(i+"*");
        }
        System.out.println();
        System.out.println("factorial of"+n+":"+fact);
    }
}
