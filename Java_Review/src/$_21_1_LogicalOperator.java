import java.util.Scanner;

public class $_21_1_LogicalOperator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter any letter:");
        char ch=scan.next().charAt(0);
        if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U'){
            System.out.println("vowel");
        }
        else{
            System.out.println("consonant");
        }
    }
}
