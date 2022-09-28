import java.util.Scanner;

public class $_53_1_sum_average {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a[]=new int[10];
        System.out.println("enter "+a.length+" number:");
        int sum=0;
        int i;
        for(i=0;i<a.length;i++){
            a[i]=scan.nextInt();
            sum=sum+a[i];
        }
        System.out.println("summation :"+sum);
        int avg=(sum/a.length);
        System.out.println("average:"+avg);

    }
}
