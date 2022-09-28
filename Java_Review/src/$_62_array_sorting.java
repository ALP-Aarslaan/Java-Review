import java.util.Arrays;

public class $_62_array_sorting {
    public static void main(String[] args) {
        int a[]={1,4,-6,3,-8,44};
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            System.out.print(" "+a[i]);
        }
        System.out.println();
        String names[]={"mohammad","jonayed","sarkar"};
        Arrays.sort(names);
        for(int i=0;i<names.length;i++){
            System.out.print(names[i]+"\t ");
        }
    }
}
