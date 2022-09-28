import java.util.ArrayList;

public class $_64_1_arraylist_part2 {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(50);
        System.out.println(num);
        System.out.println("is arrayList empty?\nAns:" + num.isEmpty());
        System.out.println("is arraylist contains  30?\nAns:"+num.contains(30));
        System.out.println("what is the index of 40?\nans:"+num.indexOf(40));
        num.set(0,100);
        System.out.println(num);
        System.out.println("what is the value of index 2?\nans:"+num.get(2));
    }
}
