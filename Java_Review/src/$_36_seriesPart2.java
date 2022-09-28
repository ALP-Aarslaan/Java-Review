import java.util.Scanner;

public class $_36_seriesPart2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int n;
        int result=1;
        System.out.println("enter a number:");
        n=scan.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print(i+"X");
            result=result*i;
        }
        System.out.println("result:"+result);
        System.out.println();
        result=1;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.print(i+"x");
                result=result*i;
            }
        }
        System.out.println("result:"+result);
        System.out.println();
    }
}
