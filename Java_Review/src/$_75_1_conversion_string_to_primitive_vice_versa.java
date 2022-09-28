public class $_75_1_conversion_string_to_primitive_vice_versa {
    public static void main(String[] args) {
        int a=32;
        String s=Integer.toString(a);
        System.out.println("a:"+a);
        String s2="32";
        int a2=Integer.parseInt(s2);
        System.out.println(a2);
        a2=Integer.valueOf(s2);
        System.out.println(a2);

    }
}
