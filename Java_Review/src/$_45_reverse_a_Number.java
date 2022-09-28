import java.util.Scanner;

public class $_45_reverse_a_Number {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num,r,sum=0,temp;
        System.out.println("enter a number:");
        num=scan.nextInt();
        temp=num;
        while(temp!=0){
            r=temp%10;
            sum=sum*10+r;
            temp=temp/10;
        }
        System.out.println("reverse of "+num+" = "+sum);
    }
}
