public class $_61_array_output_part_2 {
    public static void main(String[] args) {
        int a[][]=new int[4][];
        int n=0;
        a[0]=new int[1];
        a[1]=new int[2];
        a[2]=new int[3];
        a[3]=new int[4];
        for(int row=0;row<4;row++){
            for(int col=0;col<row+1;col++){
                a[row][col]=n;
                n++;
            }
        }
        for(int row=0;row<4;row++){
            for(int col=0;col<row+1;col++){
                System.out.print(" "+a[row][col]);
            }
            System.out.println();
        }
    }
}
