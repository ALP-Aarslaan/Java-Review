public class $_69_String_part3 {
    public static void main(String[] args) {
        String name="Mohammad";
        System.out.println(name);
        String country="  my country name is Bangladesh  ";
        String s1=country.trim();
        System.out.println(s1);
        char ch=country.charAt(0);
        System.out.println(ch);
        int value=country.codePointAt(0);
        System.out.println(value);
        int pos=country.indexOf('c');
        System.out.println("position :"+pos);
        pos=country.lastIndexOf('h');
        System.out.println(pos);

    }
}
