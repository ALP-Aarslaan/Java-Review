import java.util.Scanner;

public class $_43_Sum_of_digits {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num,r,sum=0;
        System.out.println("enter any number:");
        num=scan.nextInt();
        int temp=num;
        while(temp!=0){
            r=temp%10;
            sum=sum+r;
            temp=temp/10;
        }
        System.out.println("sum of digits"+num+":"+sum);
    }
}
