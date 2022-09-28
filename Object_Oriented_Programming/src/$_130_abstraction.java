public class $_130_abstraction {
    public static void main(String[] args) {
        sms s1;
        s1=new rahim();
        s1.message();
        s1=new karim();
        s1.message();
    }
}
abstract class sms{
   abstract void message();
}
class rahim extends sms{
    void message(){
        System.out.println("hi,i am rahim");
    }
}
class karim extends sms{
    void message(){
        System.out.println("hi, i am karim");
    }
}
