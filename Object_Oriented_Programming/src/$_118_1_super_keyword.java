public class $_118_1_super_keyword {
    public static void main(String[] args) {
        b1 ob=new b1();
        ob.y=30;
        ob.display();
    }
}
class a1{
    int y=20;
}
class b1 extends a1{
    int y=22;
    void display(){
        System.out.println("y:"+y);
        System.out.println("y:"+super.y);
    }
}
