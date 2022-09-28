import java.util.Scanner;

public class $_38_multiplication_table {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num,num1;
        System.out.println("enter initial number:");
        num=scan.nextInt();
        System.out.println("enter final number");
        num1=scan.nextInt();
        for(int i=num;i<=num1;i++){
            for(int j=1;j<=10;j++){
                System.out.println(i+" x "+j+" = "+i*j);
            }
            System.out.println("\n");
        }

    }
}
