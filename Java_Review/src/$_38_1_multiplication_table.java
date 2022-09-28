import java.util.Scanner;

public class $_38_1_multiplication_table {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n1,n2,i,j;
        System.out.println("enter initial number:");
        n1=scan.nextInt();
        System.out.println("enter final number:");
        n2=scan.nextInt();
        for(i=n1;i<=n2;i++){
            for(j=1;j<=10;j++){
                System.out.println(i+" x "+j+" = "+i*j);
            }
            System.out.println("\n");
        }
    }
}
