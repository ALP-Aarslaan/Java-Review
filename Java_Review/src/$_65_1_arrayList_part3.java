import java.util.ArrayList;

public class $_65_1_arrayList_part3 {
    public static void main(String[] args) {
        ArrayList<Integer> num1=new ArrayList<>();
        ArrayList<Integer>num2=new ArrayList<>();
        ArrayList<Integer>num3=new ArrayList<>();
        num1.add(10);
        num1.add(20);
        num1.add(30);
        System.out.println(num1);
        num2.add(40);
        num2.add(50);
        num2.add(60);
        System.out.println(num2);
        num3.addAll(num1);
        System.out.println("num1 == num2?\nans:"+num3.equals(num2));
    }
}
