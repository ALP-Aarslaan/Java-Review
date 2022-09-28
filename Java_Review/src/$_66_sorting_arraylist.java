import java.util.ArrayList;
import java.util.Collections;

public class $_66_sorting_arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> num=new ArrayList<>();
        num.add(-3);
        num.add(0);
        num.add(23);
        num.add(1009);
        num.add(-45);
        System.out.println(num);
        System.out.println("after sorting:");
        Collections.sort(num);
        System.out.println(num);
        System.out.println("sorting in descending order:");
        Collections.sort(num,Collections.reverseOrder());
        System.out.println(num);
    }
}
