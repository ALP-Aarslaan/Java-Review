public class $_73_String_Builder {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("Mohammad ");
        System.out.println(str);
        str.append("Jonayed");
        System.out.println(str);
        str.reverse();
        System.out.println(str);
        str.delete(0,17);
        System.out.println(str);
    }
}
