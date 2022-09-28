public class $_119_1_super_keyword_part2 {
    public static void main(String[] args) {
        d2 ob=new d2();
        ob.display();
    }
}
class d1{
    void display(){
        System.out.println(" i am class d1");
    }
    void message(){
        System.out.println("message from class d1");
    }
}
class d2 extends d1{
    void display(){
        message();
        super.display();
        System.out.println("i am class d2");
    }
}