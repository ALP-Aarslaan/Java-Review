public class $_60_1_array_output {
    public static void main(String[] args) {
        int a[][]= new int[5][5];
        int n=0;
        for(int row=0;row<5;row++){
            for(int col=0;col<5;col++){
                a[row][col]=n;
                n++;
            }
        }
        for(int row=0;row<5;row++){
            for(int col=0;col<5;col++){
                System.out.print(" \t"+a[row][col]);
            }
            System.out.println();
        }
    }
}
