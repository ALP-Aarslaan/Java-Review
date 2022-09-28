public class $_109_inheritance {
    public static void main(String[] args) {
        teachers t1=new teachers();
        t1.name="Mohammad";
        t1.age=22;
        t1.department="CSE";
        t1.display1();
        persons2 p1=new persons2();
        p1.age=22;
        p1.name="Jonayed";
        p1.display();
    }
}
class persons2{
    String name;
    int age;
    void display(){
        System.out.println("name:"+name);
        System.out.println("age:"+age);
    }
}
class teachers extends persons2{
    String department;
    void display1(){
        display();
        System.out.println("department:"+department);
        System.out.println();
    }
}