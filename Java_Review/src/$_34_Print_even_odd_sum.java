import java.util.Scanner;

import java.util.Scanner;
public class $_34_Print_even_odd_sum {
    public static void main(String[] args) {
        int sum=0;
        for(int i=1;i<=10;i++){
            sum=sum+i;
        }
        System.out.println("summation is:"+sum);
        Scanner scan=new Scanner(System.in);
        int m,n;
        System.out.println("enter initial number:");
        m=scan.nextInt();
        System.out.println("enter last number:");
        n=scan.nextInt();
        for(int i=m;i<=n;i++){
            System.out.println(i);
        }
        System.out.println();
        sum=0;
        for(int i=m;i<=n;i++){
            if(i%2==0){
                System.out.print("\t"+i);
                sum=sum+i;
            }
        }
        System.out.println("summation of all even number m-n:"+sum);
        System.out.println();
        sum=0;
        for(int i=m;i<=n;i++){
            if(i%2!=0){
                sum=sum+i;
                System.out.println(i+"\t");
            }
        }
        System.out.println("summation of all odd number from m-n:"+sum);
    }
}
