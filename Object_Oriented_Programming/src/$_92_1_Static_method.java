public class $_92_1_Static_method {
    public static void main(String[] args) {
        fruits ob1=new fruits();
        ob1.display1();
        fruits.display2();
    }
}
class fruits{
    void display1(){
        System.out.println("i am non static method");
    }
    static void display2(){
        System.out.println("i am static method");
    }
}
