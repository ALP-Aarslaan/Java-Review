public class $_92_static_method {
    public static void main(String[] args) {
        staticMethod object1=new staticMethod();
        object1.display1();
        staticMethod.display2();
    }
}
class staticMethod{
    void display1(){
        System.out.println("i am non static method");
    }
    static void display2(){
        System.out.println("i am a static method");
    }
}
