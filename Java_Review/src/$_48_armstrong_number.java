import java.util.Scanner;

public class $_48_armstrong_number {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num,sum=0,temp,r;
        System.out.println("enter a number:");
        num=scan.nextInt();
        temp=num;
        while(temp!=0){
            r=temp%10;
            sum=sum+r*r*r;
            temp=temp/10;
        }
        System.out.println("total sum:"+sum);
        if(sum==num){
            System.out.println("this is armstrong number");
        }
        else{
            System.out.println("this is not armstrong number");
        }
    }
}
