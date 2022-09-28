public class $_16_Unary_operator {
    public static void main(String[] args) {
        int x=10;
        int result=+x;
        System.out.println("x="+result);
        result=-x;
        System.out.println("x="+result);
        int y=-10;
        int result1=+y;
        System.out.println("y="+result1);
        result1=-y;
        System.out.println("y="+result1);
        //increment
        int z=25;
        int w=z++;//postIncrement
        System.out.println("w="+w);
        w=z;
        System.out.println("w="+w);
        int a=10;
        w=++a;//preIncrement
        System.out.println("w="+w);
        int b=30;
        w=--b;
        System.out.println("w="+w);
        w=b--;
        System.out.println("w="+w);
    }
}
