import java.util.Arrays;

public class $_62_1_array_sorting {
    public static void main(String[] args) {
        int a[]={1,3,22,55,-99,-2};
        Arrays.sort(a);
        for(int i=5;i>=0;i--){
            System.out.println(a[i]);
        }
        System.out.println();
        String names[]={"mohammad","jonayed","sarkar"};
        Arrays.sort(names);
        for(int i=2;i>=0;i--){
            System.out.println(names[i]);
        }
    }
}
