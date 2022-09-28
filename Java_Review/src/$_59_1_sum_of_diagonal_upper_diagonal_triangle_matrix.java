import java.util.Scanner;

public class $_59_1_sum_of_diagonal_upper_diagonal_triangle_matrix {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a[][]=new int[3][3];
        int sumd=0,sumu=0,sumb=0;
        System.out.println("enter matrix a elements:");
        for(int row=0;row<3;row++){
            for(int col=0;col<3;col++){
                a[row][col]=scan.nextInt();
            }
        }
        for(int row=0;row<3;row++){
            for(int col=0;col<3;col++){
                if(row==col){
                    sumd=sumd+a[row][col];
                }
                if(row<col){
                    sumu=sumu+a[row][col];
                }
                if(row>col){
                    sumb=sumb+a[row][col];
                }
            }
        }
        System.out.println("sum of diagonal elements:"+sumd);
        System.out.println("sum of upper triangle elements:"+sumu);
        System.out.println("sum of lower triangle elements:"+sumb);
    }
}
