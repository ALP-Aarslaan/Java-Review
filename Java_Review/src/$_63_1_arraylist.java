import java.util.ArrayList;
import java.util.Iterator;

public class $_63_1_arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> num=new ArrayList<>();
        num.add(0,10);
        num.add(1,20);
        num.add(2,30);
        num.add(3,40);
        num.add(4,50);
        System.out.println(num);
        for(int i:num){
            System.out.println(i);
        }
        Iterator itr=num.iterator();
        while(itr.hasNext()){
            System.out.println(" "+itr.next());
        }
        num.remove(2);
        System.out.println(num);
        num.removeAll(num);
        System.out.println(num);
    }
}
