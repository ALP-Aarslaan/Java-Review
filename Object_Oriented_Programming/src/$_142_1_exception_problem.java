import java.util.Scanner;

public class $_142_1_exception_problem {
    public static void main(String[] args) {
        int count=1;
        do{
            try{
                Scanner scan =new Scanner(System.in);
                System.out.print("enter a number :");
                int num1=scan.nextInt();
                System.out.print("enter a number :");
                int num2=scan.nextInt();
                int result=num1/num2;
                System.out.println("result : "+result);
                count++;
            }catch(Exception e){
                System.out.println(e);
                System.out.println("enter integer");
            }
        }while(count==1);
    }
}
