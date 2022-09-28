public class $_126_polymorphism_method_overriding {
    public static void main(String[] args) {
        override a=new override();
        a.age=22;
        a.name="mohammad";
        a.display();
        //overriding b=new overriding();
        //b.qualification="student";
        //b.display();
        a=new overriding();
        a.display();
    }
}
class override{
    int age;
    String name;
    void display(){
        System.out.println("age:"+age);
        System.out.println("name:"+name);
    }
}
class overriding extends override{
    String qualification;

    void display() {
        super.display();
        System.out.println("qualification :"+qualification);
    }
}