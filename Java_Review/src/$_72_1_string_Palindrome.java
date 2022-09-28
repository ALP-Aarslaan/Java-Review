import java.util.Scanner;

public class $_72_1_string_Palindrome {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter here:");
        String s1=scan.next();
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
