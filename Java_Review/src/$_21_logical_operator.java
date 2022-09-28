import java.util.Scanner;

public class $_21_logical_operator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        char ch;
        System.out.println("enter any letter:");
        ch=scan.next().charAt(0);
        if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='O'||ch=='o'||ch=='u'||ch=='U'){
            System.out.println("vowel");
        }
        else{
            System.out.println("consonant");
        }
    }
}
