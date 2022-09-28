import java.util.ArrayList;
import java.util.Iterator;

public class $_63_arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> num=new ArrayList<>();
        num.add(0,1);
        num.add(2);
        num.add(2,3);
        System.out.println(num);
        for(int x:num){
            System.out.println(x);
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
