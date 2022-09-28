public class $_139_1_anonymousClass {
    public static void main(String[] args) {
        math ob1=new math(){
            void display(){
                System.out.println("main class");
            }
        };
        ob1.display();
    }
}
class math{
    void display(){
        System.out.println("math class");
    }
}
