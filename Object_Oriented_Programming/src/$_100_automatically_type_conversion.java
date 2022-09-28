public class $_100_automatically_type_conversion {
    public static void main(String[] args) {
        type ob1=new type();
        ob1.add(4,3);
        ob1.add(4.6f,34);
    }
}
class type{
    void add(double a,double b){
        System.out.println(a+b);
    }
    void add(int a,int b){
        System.out.println(a+b);
    }
}
