public interface $_133_1_multiple_inheritance {
    void display();
}
interface B1{
    void display();
}
class C1 implements $_133_1_multiple_inheritance,B1{
    public void display(){
        System.out.println("Multiple inheritance example");
    }
}
class Test1{
    public static void main(String[] args) {
        C1 ob=new C1();
        ob.display();
    }
}
