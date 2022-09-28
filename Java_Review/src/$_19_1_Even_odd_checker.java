import java.util.Scanner;

public class $_19_1_Even_odd_checker {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num;
        System.out.println("enter any positive integer number:");
        num=scan.nextInt();
        if(num%2==0){
            System.out.println(num+" is an even number");
        }
        else if(num%2!=0){
            System.out.println(num+" is an odd number");
        }
    }
}
