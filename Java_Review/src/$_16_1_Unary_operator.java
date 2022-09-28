public class $_16_1_Unary_operator {
    public static void main(String[] args) {
        int a=10;
        int b=a++;//b=10
        System.out.println("b="+b);
        b=++a;//b=12
        System.out.println("b="+b);
        b=a--;//b=12;
        System.out.println("b="+b);
        b=--a;//b=10;
        System.out.println("b="+b);
        int c=-10;
        b=-c;
        System.out.println("b="+b);
        b=+c;
        System.out.println("b="+b);

    }
}
