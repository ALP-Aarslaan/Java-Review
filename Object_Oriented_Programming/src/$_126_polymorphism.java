public class $_126_polymorphism {
    public static void main(String[] args) {
        sum a=new sum();
        a.add();
        a.add(5,6);
        a.add(5.4,6.7);
    }
}
//method overloading is one kind of polymorphism
class sum{
    void add(double a,double b){
        System.out.println(a+b);
    }
    void add(int a, int b){
        System.out.println(a+b);
    }
    void add(){
        System.out.println("no value");
    }
}
