public class $_91_Static_variable {
    public static void main(String[] args) {
        fruit f1=new fruit();
        f1.display();
        fruit f2=new fruit();
        f1.display();
        fruit f3=new fruit();
        f1.display();
    }
}
class fruit{
    static int count=0;
    fruit(){
        count++;
    }
    void display(){
        System.out.println("number of fruits:"+count);
    }

}
