import java.util.Scanner;

public class $_19_Even_odd_checker {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num;
        System.out.println("enter any positive number:");
        num=scan.nextInt();
        if(num%2==0){
            System.out.println(num+" is a even number");
        }
        else {
            System.out.println(num+" is a odd number");
        }
    }
}
