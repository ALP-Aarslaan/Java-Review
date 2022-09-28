import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class $_39_1_prime_number {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num,count=0;
        System.out.println("enter any number:");
        num=scan.nextInt();
        for(int i=2;i<num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==0){
            System.out.println(num+" is a prime number");
        }
        else{
            System.out.println(num+" is not a prime number");
        }
    }
}
