import java.util.Scanner;

public class $_41_fibonacci_series {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter any number:");
        int n=scan.nextInt();
        int first=0,second=1;
        System.out.print(first+" "+second);
        int i,fibonacci;
        for(i=3;i<=n;i++){
            fibonacci=first+second;
            System.out.print(" "+fibonacci);
            first=second;
            second=fibonacci;
        }
        System.out.println();
    }
}
