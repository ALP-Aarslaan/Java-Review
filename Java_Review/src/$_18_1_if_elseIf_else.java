import java.util.Scanner;

public class $_18_1_if_elseIf_else {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int number;
        System.out.println("enter a number:");
        number=scan.nextInt();
        if(number>0){
            System.out.println("positive number");
        }
        else if(number<0){
            System.out.println("negative number");
        }
        else{
            System.out.println("this is Zero");
        }
    }
}
