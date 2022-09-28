public class $_114_Method_Overriding {
    public static void main(String[] args) {
        A ob1=new A();
        ob1.age=22;
        ob1.name="Mohammad";
        ob1.display();

        System.out.println();

        B ob2=new B();
        ob2.name="jonayed";
        ob2.age=22;
        ob2.qualification="student";
        ob2.display();

    }
}
class A{
    String name;
    int age;
    void display(){
        System.out.println("name: "+name);
        System.out.println("age: "+age);
    }
}
class B extends A{
    String qualification;
    void display(){
        System.out.println("name: "+name);
        System.out.println("age: "+age);
        System.out.println("qualification : "+qualification);
    }
}

