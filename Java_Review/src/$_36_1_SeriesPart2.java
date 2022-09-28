import java.util.Scanner;

public class $_36_1_SeriesPart2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n,sum=1;
        System.out.println("enter a number:");
        n=scan.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                System.out.print(i+" *");
                sum=sum*i;
            }
        }
        System.out.println();
        System.out.println("sum="+sum);
    }
}
