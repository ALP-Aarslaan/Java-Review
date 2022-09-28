public class $_75_coversion_between_string_and_Primitive_data {
    public static void main(String[] args) {
        int a=12;
        String s=Integer.toString(a);
        System.out.println(s);
        double d= 34.556;
        String s1=Double.toString(d);
        System.out.println(s1);
        String s3="43.67";
        float f=Float.parseFloat(s3);
        System.out.println(f);
        String s4="34";
        int c=Integer.valueOf(s4);
        System.out.println(c);


    }
}
