import org.w3c.dom.ls.LSOutput;

public class $_127_1_Dynamic_polymorphism {
    public static void main(String[] args) {
        person7 p=new person7();
                p.display();
        p=new student7();
        p.display();
        p=new teacher7();
        p.display();

    }
}
class person7{
    void display(){
        System.out.println("i am person class");
    }
}
class student7 extends person7{
    void display(){
        System.out.println("i am student class");
    }
}
class teacher7 extends person7{
    void display(){
        System.out.println("i am teacher class");
    }
}
