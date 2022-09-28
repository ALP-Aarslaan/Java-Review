public class $_93_Restrictions_of_static_method {
    public static void main(String[] args) {
        stat ob1=new stat();
        ob1.display();
        stat.display1();
    }
}
class stat{
    int num=10;
    void display(){
        display1();//we can call static method in non static method
        System.out.println("i am non static method");
        System.out.println("number:"+num);
    }
    static int num1=22;
    static void display1(){
        //we can't call non static method in static method
        System.out.println("i am a static method");
        System.out.println("number:"+num1);
    }
}
