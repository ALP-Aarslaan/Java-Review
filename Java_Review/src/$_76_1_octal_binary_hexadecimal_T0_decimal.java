public class $_76_1_octal_binary_hexadecimal_T0_decimal {
    public static void main(String[] args) {
        String binary="1010";
        int decimal=Integer.parseInt(binary,2);
        System.out.println("binary to decimal:"+decimal);
        String octal="67";
        decimal=Integer.parseInt(octal,8);
        System.out.println("octal to decimal:"+decimal);
        String hex="F";
        decimal=Integer.parseInt(hex,16);
        System.out.println("hexadecimal to decimal:"+decimal);
    }
}
