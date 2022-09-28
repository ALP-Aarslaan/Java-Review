public class $_73_1_String_builder {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("Mohammad");
        System.out.println(str);
        str.append(" 19101019");
        System.out.println(str);
        str.reverse();
        System.out.println(str);
        str.delete(0,20);
        System.out.println("STR : "+str);
    }
}
