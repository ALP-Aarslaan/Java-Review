import java.util.Scanner;

public class $_35_Series {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n,sum=0;
        System.out.println("enter last number:");
        n=scan.nextInt();
        for(int i=1;i<=n;i++){
            sum=sum+i;
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("total sum is:"+sum);
        System.out.println();
        sum=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                System.out.print(i+" ");
                sum=sum+i;
            }
        }
        System.out.println();
        System.out.println("total sum:"+sum);
        sum=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.print(i+" ");
                sum=sum+i;
            }
        }
        System.out.println();
        System.out.println("total sum:"+sum);
        sum=0;
        for(int i=1;i<=n;i++){
            System.out.println(i*i+" ");
        }
    }
}
