import java.util.Scanner;

public class $_20_1_Vowel_consonant_checker {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        char letter;
        System.out.println("enter any letter:");
        letter=scan.next().charAt(0);
        if(letter=='a'||letter=='A'){
            System.out.println("vowel");
        }
        else if(letter=='e'||letter=='E'){
            System.out.println("vowel");
        }
        else if(letter=='i'||letter=='I'){
            System.out.println("vowel");
        }
        else if(letter=='o'||letter=='O'){
            System.out.println("vowel");
        }
        else if(letter=='u'||letter=='U'){
            System.out.println("vowel");
        }
        else{
            System.out.println("consonant");
        }
    }
}
