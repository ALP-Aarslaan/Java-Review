public class $_76_binary_octal_hexadecimal_to_decimal {
    public static void main(String[] args) {
        String binary="1111";
        int decimal=Integer.parseInt(binary,2);
        System.out.println("decimal : "+decimal);
        String octal="676";
        decimal=Integer.parseInt(octal,8);
        System.out.println("decimal : "+decimal);
        String hex="A";
        decimal=Integer.parseInt(hex,16);
        System.out.println("decimal : "+decimal);
    }
}
