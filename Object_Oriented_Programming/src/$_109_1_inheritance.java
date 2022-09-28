public class $_109_1_inheritance {
    public static void main(String[] args) {
        persons3 p1=new persons3();
        p1.age=22;
        p1.name="Mohammad";
        p1.display();
        teachers3 t1=new teachers3();
        t1.faculty="CSE";
        t1.name="Jonayed";
        t1.age=22;
        t1.display1();
    }
}
class persons3{
    String name;
    int age;
    void display(){
        System.out.println("name:"+name);
        System.out.println("age:"+age);
    }
}
class teachers3 extends persons3{
    String faculty;
    void display1(){
        display();
        System.out.println("faculty:"+faculty);
    }
}


