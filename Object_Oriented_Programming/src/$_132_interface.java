public interface $_132_interface {
    void animal();
}
class dog implements $_132_interface{
   public  void animal(){
        System.out.println("dog is a faithful animal ");
    }
}
class cat extends dog{
    public void animal(){
        System.out.println("cat eats mice");
    }
}
interface snake extends $_132_interface{
    public void animal();
}
class test {
    public static void main(String[] args) {
        $_132_interface s1;
        s1 = new dog();
        s1.animal();
        s1 = new cat();
        s1.animal();
    }
}
