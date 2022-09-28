import java.util.Scanner;

public class $_47_PALINDROME_NUMBER {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num,sum=0,temp,r;
        System.out.println("enter a number:");
        num=scan.nextInt();
        temp=num;
        while(temp!=0){
            r=temp%10;
            sum=sum*10+r;
            temp=temp/10;
        }
        if(sum==num){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
