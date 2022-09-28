import java.util.Scanner;

public class $_53_Sum_and_average {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num[]=new int[10];
        int sum=0;
        System.out.println("enter "+num.length+" number:");
        for(int i=0;i<num.length;i++){
            num[i]=scan.nextInt();
            sum=sum+num[i];
        }
        System.out.println("summation:"+sum);
        int avg=(sum/num.length);
        System.out.println("average :"+avg);
    }
}
