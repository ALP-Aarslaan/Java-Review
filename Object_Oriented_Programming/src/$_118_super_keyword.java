public class $_118_super_keyword {
    public static void main(String[] args) {
        b ob=new b();
        ob.display();
    }
}
class a{
    int x=10;
}
class b extends a{
    int x=5;
    void display(){
        System.out.println("x : "+x);
        System.out.println("x : "+super.x);
    }
}
