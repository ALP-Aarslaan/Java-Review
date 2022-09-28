public class $_130_1_abstraction {
    public static void main(String[] args) {
        call a1;
        a1=new jonayed();
        a1.display();
        a1.phone();
        a1=new mohammad();
        a1.phone();
        a1.display();
    }
}
abstract class call{
   abstract void phone();
   void display(){
       System.out.println("i am abstract class");
   }
}
class jonayed extends call{
    void phone(){
        System.out.println("i am jonayed");
    }
}
class mohammad extends call{
    void phone(){
        System.out.println("i am mohammad");
    }
}
