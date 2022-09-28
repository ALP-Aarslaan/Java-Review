import java.util.Scanner;

public class $_51_1_patterns_part2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter line numbers:");
        int n=scan.nextInt();
        for(int row=n;row>=1;row--){
            for(int col=1;col<=row;col++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
