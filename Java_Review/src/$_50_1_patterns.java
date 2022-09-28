import java.util.Scanner;

public class $_50_1_patterns {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter line number:");
        int n=scan.nextInt();
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
