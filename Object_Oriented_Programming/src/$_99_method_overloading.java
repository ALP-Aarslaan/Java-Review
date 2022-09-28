public class $_99_method_overloading {
    public static void main(String[] args) {
        polymorphism ob1=new polymorphism();
        ob1.add();
        ob1.add(1,2,3);
        ob1.add(12.3,34.5);
        ob1.add(2,5);
    }
}
class polymorphism{
    void add(int a,int b){
        System.out.println(a+b);
    }
    void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    void add(double a,double b){
        System.out.println(a+b);
    }
    void add(){
        System.out.println("nothing to add");
    }
}
