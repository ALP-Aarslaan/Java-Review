import java.util.Scanner;

public class $_51_patterns_part2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter line number:");
        int n=scan.nextInt();
        for(int row=n;row>=1;row--){
            for(int col=1;col<=row;col++){
                System.out.print(" "+col);
            }
            System.out.println();
        }
    }
}
