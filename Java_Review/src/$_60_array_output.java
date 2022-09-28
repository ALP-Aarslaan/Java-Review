import java.util.Scanner;

public class $_60_array_output {
    public static void main(String[] args) {
        Scanner Scan= new Scanner(System.in);
        int a[][]=new int[4][5];
        int n=0;
        for (int row=0;row<4;row++){
            for(int col=0;col<5;col++){
                a[row][col]=n;
                n++;
            }
        }
        System.out.println();
        for(int row=0;row<4;row++){
            for(int col=0;col<5;col++){
                System.out.print(" "+a[row][col]);
            }
            System.out.println();
        }
    }
}
