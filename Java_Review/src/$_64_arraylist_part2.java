import java.util.ArrayList;

public class $_64_arraylist_part2 {
    public static void main(String[] args) {
        ArrayList<Integer>num=new ArrayList<>();
        num.add(0,10);
        num.add(1,20);
        num.add(2,30);
        num.add(3,40);
        num.add(4,50);
        System.out.println(num);
        boolean check=num.isEmpty();
        System.out.println(check);
        System.out.println("is array list is containing 60? \nAns:"+num.contains(60));
        System.out.println("what is the index of 40?\nAns:"+num.indexOf(40));
        num.set(3,60);
        System.out.println(num);
        int indexValue=num.get(3);
        System.out.println(indexValue);
    }
}
