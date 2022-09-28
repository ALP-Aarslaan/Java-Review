public interface $_133_multiple_inheritance_interface {
    void A();
}
interface inherit{
    void A();
}
class multiple implements $_133_multiple_inheritance_interface,inherit{
    public void A(){
        System.out.println("multiple inheritance example");
    }
}
class Test{
    public static void main(String[] args) {
        multiple a1=new multiple();
        a1.A();
    }
}

