public class $_61_1_array_output_part2 {
    public static void main(String[] args) {
        int a[][]=new int[5][];
        int n=0;
        a[0]=new int [1];
        a[1]=new int [2];
        a[2]=new int[3];
        a[3]=new int [4];
        a[4]=new int [5];
        for(int row=0;row<5;row++){
            for(int col=0;col<row+1;col++){
                a[row][col]=n;
                n++;
            }
        }
        for(int row=0;row<5;row++){
            for(int col=0;col<row+1;col++){
                System.out.print(" "+a[row][col]);
            }
            System.out.println();
        }
    }
}
