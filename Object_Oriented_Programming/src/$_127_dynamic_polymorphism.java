public class $_127_dynamic_polymorphism {
    public static void main(String[] args) {
        person6 p=new person6();
        p.display();
        teacher6 t=new teacher6();
        t.display();
        students6 s=new students6();
        s.display();
        System.out.println("\n");
        p.display();
        p=new teacher6();
        p.display();
        p=new students6();
        p.display();
    }
}
class person6{
    void display(){
        System.out.println("i am a person");
    }
}
class teacher6 extends person6{
    void display(){
        System.out.println("i am a teacher");
    }
}
class students6 extends person6{
    void display(){
        System.out.println("i am a student");
    }
}