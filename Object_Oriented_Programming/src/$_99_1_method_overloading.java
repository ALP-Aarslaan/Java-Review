public class $_99_1_method_overloading {
    public static void main(String[] args) {
        overload ob1=new overload();
        ob1.add();
        ob1.add(1,2);
        ob1.add(12.3,12.3);
        ob1.add(1,2,3);
    }
}
class overload{
    void add(int a ,int b){
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
