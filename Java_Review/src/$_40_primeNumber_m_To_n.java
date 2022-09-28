import java.util.Scanner;

public class $_40_primeNumber_m_To_n {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int m,n,count=0;
        System.out.println("enter initial value:");
        m=scan.nextInt();
        System.out.println("enter final value:");
        n=scan.nextInt();
        int i,j;
        for(i=m;i<=n;i++){
            for(j=2;j<i;j++){
                if(i%j==0){
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.println(i);
            }
            count=0;
        }
    }
}
