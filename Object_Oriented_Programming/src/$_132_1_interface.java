public interface $_132_1_interface {
    void animal();
}
class dog1 implements $_132_1_interface{
    public void animal(){
        System.out.println("dogs are faithful");
    }
}
class cat1 implements $_132_1_interface{
    public void animal(){
        System.out.println("cats eat mice");
    }
}
class test3{
    public static void main(String[] args) {
        $_132_1_interface a1;
        a1=new dog1();
        a1.animal();
        a1=new cat1();
        a1.animal();
    }
}

