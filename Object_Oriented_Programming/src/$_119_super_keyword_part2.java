public class $_119_super_keyword_part2 {
    public static void main(String[] args) {
        c2 ob=new c2();
        ob.display();
    }
}
class c1{
    void  display(){
        System.out.println("i am class c1");
    }
    void sms(){
        System.out.println("sms from c1");
    }
}
class c2 extends c1{
    void display(){
        sms();
        super.display();
        System.out.println("i am class c2");
    }
}
