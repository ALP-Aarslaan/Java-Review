public class $_71_1_String_Buffer {
    public static void main(String[] args) {
        String s1="Mohammad Jonayed Sarkar ";
        StringBuffer sb=new StringBuffer(s1);
        System.out.println(sb);
        sb.append(19101019);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.reverse();
        sb.delete(0,8);
        System.out.println(sb);
        sb.setLength(8);
        System.out.println(sb);
    }
}
