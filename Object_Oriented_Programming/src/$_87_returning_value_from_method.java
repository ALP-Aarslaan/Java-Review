public class $_87_returning_value_from_method {
    public static void main(String[] args) {
        value num1=new value();
        int result=num1.square(5);
        System.out.println("square:"+result);
        System.out.println("square of:"+num1.square(4));
    }
}
class value{
    int square(int num){
        return num*num;
    }
}
