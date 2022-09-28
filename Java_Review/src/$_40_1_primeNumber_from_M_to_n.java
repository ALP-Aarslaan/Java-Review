import java.util.Scanner;

public class $_40_1_primeNumber_from_M_to_n {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int m,n,count=0,i,j;
        System.out.println("enter initial number:");
        m=scan.nextInt();
        System.out.println("enter final number:");
        n=scan.nextInt();
        for(i=m;i<=n;i++){
            for(j=2;j<i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==0){
                System.out.println(i);
            }
            count=0;
        }
    }
}
