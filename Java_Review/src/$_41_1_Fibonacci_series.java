import java.util.Scanner;

public class $_41_1_Fibonacci_series {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter any number:");
        int num=scan.nextInt();
        int first=0;
        int second=1;
        System.out.print(first+" "+second);
        int i,fibo;
        for(i=3;i<=num;i++){
            fibo=first+second;
            System.out.print(" "+fibo);
            first=second;
            second=fibo;
        }
        System.out.println();
    }
}
