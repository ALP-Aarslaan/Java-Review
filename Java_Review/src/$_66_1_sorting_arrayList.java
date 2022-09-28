import java.util.ArrayList;
import java.util.Collections;

public class $_66_1_sorting_arrayList {
    public static void main(String[] args) {
        ArrayList<Integer>num=new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        System.out.println(num);
        System.out.println("after sorting the array list:");
        Collections.sort(num);
        System.out.println(num);
        System.out.println("after sorting in descending order:");
        Collections.sort(num,Collections.reverseOrder());
        System.out.println(num);
    }
}
