import java.util.Scanner;

public class $_56_1_2D_array {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int a[][]=new int[3][2];
        System.out.println("enter matrix elements:");
        for(int row=0;row<3;row++){
            for(int col=0;col<2;col++){
                a[row][col]=scan.nextInt();
            }
        }
        for(int row=0;row<3;row++){
            for(int col=0;col<2;col++){
                System.out.print(" "+a[row][col]);
            }
            System.out.println();
        }
    }
}
