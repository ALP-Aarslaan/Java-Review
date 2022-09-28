import java.util.Scanner;

public class $_142_Exception_problemSolving {
    public static void main(String[] args) {
        int count =1;
        do{
            try{
                Scanner scan =new Scanner(System.in);
                System.out.println("Enter a number :");
                int num1=scan.nextInt();
                System.out.println("enter another number :");
                int num2=scan.nextInt();
                int result=num1/num2;
                System.out.println("result : "+result);
                count++;
            }catch(Exception e1){
                System.out.println(e1);
                System.out.println("please try entering an integer");
            }
        }while(count==1);
    }
}
