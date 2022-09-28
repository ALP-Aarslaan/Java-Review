public class $_93_1_restrictions_of_static_method {
    public static void main(String[] args) {
        restrictions ob1=new restrictions();
        ob1.display();
        restrictions.display1();
    }
}
class restrictions{
    int num=10;
    void display(){
        display1();
        System.out.println("i am non static method");
        System.out.println(num);
    }
    static int num1=20;
    static void display1(){
        System.out.println("i am static method");
        System.out.println(num1);
    }
}
