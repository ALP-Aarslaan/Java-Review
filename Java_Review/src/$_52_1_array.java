import java.util.Scanner;

public class $_52_1_array {
    public static void main(String[] args) {
        int num[]=new int[5];
        int sum=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter "+num.length+" number");
        for(int i=0;i<5;i++){
            num[i]=scan.nextInt();
            sum=sum+num[i];
        }
        System.out.println("total sum:"+sum);
    }
}
