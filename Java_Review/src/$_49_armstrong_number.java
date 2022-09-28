import java.util.Scanner;

public class $_49_armstrong_number {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int num,sum=0,r,temp;
        System.out.println("enter a number:");
        num=scan.nextInt();
        temp=num;
        while(temp!=0){
            r=temp%10;
            sum= (int) (sum+Math.pow(r,3));
            temp=temp/10;
        }
        if(sum==num){
            System.out.println("Armstrong_Number");
        }
        else{
            System.out.println("Not_armstrong_number");
        }
    }
}
