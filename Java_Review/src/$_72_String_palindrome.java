import java.util.Scanner;

public class $_72_String_palindrome {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s1;
        System.out.println("enter a word here:");
        s1=scan.next();
        StringBuffer sb=new StringBuffer(s1);
        String s2=sb.reverse().toString();
        if(s1.equals(s2)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
