import java.util.Scanner;

public class $_57_1_array_matrix {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int a[][]=new int[2][3];
        int b[][]=new int[2][3];
        System.out.println("enter elements for a[][] matrix");
        for(int row=0;row<2;row++){
            for(int col=0;col<3;col++){
                System.out.printf("a[%d][%d]=",row,col);
                a[row][col]=scan.nextInt();
            }
        }
        System.out.println();
        for(int row=0;row<2;row++){
            for(int col=0;col<3;col++){
                System.out.printf("b[%d][%d]=",row,col);
                b[row][col]=scan.nextInt();
            }
        }
        System.out.println();
        System.out.println("a=");
        for (int row=0;row<2;row++){
            for(int col=0;col<3;col++){
                System.out.print(" "+a[row][col]);
            }
            System.out.println();
        }
        System.out.println("b=");
        for(int row=0;row<2;row++){
            for(int col=0;col<3;col++){
                System.out.print(" "+b[row][col]);
            }
            System.out.println();
        }
    }
}
