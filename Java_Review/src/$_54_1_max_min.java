import java.util.Scanner;

public class $_54_1_max_min {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num[]=new int[5];
        System.out.println("enter "+num.length+" number:");
        for(int i=0;i<num.length;i++){
            num[i]=scan.nextInt();
        }
        int max=num[0];
        int min=num[0];
        for(int i=1;i<num.length;i++){
            if(max<num[i]){
                max=num[i];
            }
            else if(min>num[i]){
                min=num[i];
            }
        }
        System.out.println("maximum number is:"+max);
        System.out.println("minimum number is:"+min);
    }
}
