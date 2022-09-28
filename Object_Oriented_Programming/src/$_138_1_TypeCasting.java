public class $_138_1_TypeCasting {
    public static void main(String[] args) {
        int a=10;
        double b=a;
        System.out.println("integer to double : "+b);
        double d=23.45;
        int i=(int)d;
        System.out.println("double to integer : "+i);
        AAA ob1=new BBB();
        ob1.display();
        BBB ob2=(BBB)new AAA();
        ob2.display();
    }
}
class AAA{
    void display(){
        System.out.println("i am super class");
    }
}
class BBB extends AAA{
    void display(){
        System.out.println("i am sub class");
    }
}
