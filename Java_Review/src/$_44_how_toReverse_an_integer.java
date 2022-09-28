import java.util.Scanner;

public class $_44_how_toReverse_an_integer {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num,sum=0,temp,r;
        System.out.println("enter any number:");
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
