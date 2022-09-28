public class $_123_this_keyword {
    public static void main(String[] args) {
        g g1=new g();
        g1.print();
    }
}
class g{
    void display(){
        System.out.println("this is display method");
    }
    void print(){
        this.display();
        System.out.println("this is print method");
    }
}
