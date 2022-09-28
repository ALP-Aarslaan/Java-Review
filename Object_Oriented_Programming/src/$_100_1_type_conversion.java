public class $_100_1_type_conversion {
    public static void main(String[] args) {
        typeConversion ob1=new typeConversion();
        ob1.add(2.4,3.4);
        ob1.add(1,2);
    }
}
class typeConversion{
    void add(int a,int b){
        System.out.println(a+b);
    }
    void add(double a,double b){
        System.out.println(a+b);
    }
}
