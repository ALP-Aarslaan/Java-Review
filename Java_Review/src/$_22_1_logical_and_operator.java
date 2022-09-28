import java.util.Scanner;

public class $_22_1_logical_and_operator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter any letter:");
        char letter=scan.next().charAt(0);
        if(letter>='A'&&letter<='Z'){
            System.out.println("UpperCase Letter");
        }
        else if(letter>='a'&&letter<='z'){
            System.out.println("LowerCase letter");
        }
        else if(letter>='0'&&letter<='9'){
            System.out.println("Digit");
        }
        else{
            System.out.println("character");
        }
    }
}
