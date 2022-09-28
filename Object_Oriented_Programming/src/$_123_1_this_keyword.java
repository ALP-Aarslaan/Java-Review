public class $_123_1_this_keyword {
    public static void main(String[] args) {
        g1 g=new g1();
        g.print();
    }
}
class g1{
    void display(){
        System.out.println("this is display method");
    }
    void print(){
        display();
        System.out.println("this is print method");
    }
}

