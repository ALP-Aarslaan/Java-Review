public class $_69_1_String_part3 {
    public static void main(String[] args) {
        String name="mohammad";
        System.out.println("name:"+name);
        name="    mohammad    ";
        System.out.println(name.trim());
        System.out.println("index of m:"+name.indexOf('m'));
        System.out.println("which letter in 1st index:"+name.charAt(4));
        System.out.println("ASCII value of m:"+name.codePointAt(0));
        System.out.println("last index is:"+name.lastIndexOf('d'));
    }
}
