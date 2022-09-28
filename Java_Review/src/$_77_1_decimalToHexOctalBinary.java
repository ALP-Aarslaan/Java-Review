import java.util.Scanner;

public class $_77_1_decimalToHexOctalBinary {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int decimal=10;
        String binary=Integer.toBinaryString(decimal);
        System.out.println("decimal to binary:"+binary);
        String octal=Integer.toOctalString(decimal);
        System.out.println("decimal to octal:"+octal);
        String hex=Integer.toHexString(decimal);
        System.out.println("decimal to hexadecimal:"+hex);
    }
}
