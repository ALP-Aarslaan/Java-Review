import java.util.Scanner;

public class $_18_If_else_statements {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a;
        System.out.println("enter a number:");
        a=scan.nextInt();
        if(a>0){
            System.out.println("positive number");
        }
        else if(a<0){
            System.out.println("negative number");
        }
        else{
            System.out.println("This is a Zero");
        }
    }
}
