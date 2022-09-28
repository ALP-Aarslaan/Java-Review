import java.util.Scanner;

public class $_37_1_Factorial {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num,fact=1;
        System.out.println("enter any positive number:");
        num=scan.nextInt();
        for(int i=num;i>=1;i--){
            System.out.print(i+" x ");
            fact=fact*i;
        }
        System.out.println();
        System.out.println("factorial of "+num+":"+fact);

    }
}
