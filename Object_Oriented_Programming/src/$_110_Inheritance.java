public class $_110_Inheritance {
    public static void main(String[] args) {
        teachers4 t1=new teachers4();
        t1.name="Mohammad";
        t1.age=22;
        t1.qualification="M.SC in CSE";
        t1.display1();
        persons4 p1=new persons4();
        p1.name="Jonayed";
        p1.age=22;
        p1.display();
    }
}
class persons4{
    String name;
    int age;
    void display(){
        System.out.println("name:"+name);
        System.out.println("age:"+age);
    }
}
class teachers4 extends persons4{
    String qualification;
    void display1(){
        System.out.println("name:"+name);
        System.out.println("age:"+age);
        System.out.println("qualification:"+qualification);
    }
}
