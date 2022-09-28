public class $_114_1_method_overriding {
    public static void main(String[] args) {
        c c1=new c();
        c1.age=22;
        c1.name="mohammad";
        c1.display();
        d d1=new d();
        System.out.println();
        d1.age=22;
        d1.name="Jonayed";
        d1.department="CSE";
        d1.display();
    }
}
class c{
    int age;
    String name;
    void display(){
        System.out.println("name:"+name);
        System.out.println("age:"+age);
    }
}
class d extends c{
    String department;
    void display(){
        System.out.println("name:"+name);
        System.out.println("age:"+age);
        System.out.println("Department:"+department);
    }
}
