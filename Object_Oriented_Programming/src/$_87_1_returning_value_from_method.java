public class $_87_1_returning_value_from_method {
    public static void main(String[] args) {
        value1 num=new value1();
        int result=num.square(100);
        System.out.println("result:"+result);
        System.out.println("result:"+num.square(200));
    }
}
class value1{
    int square(int num){
        return num*num;
    }
}
