public class $_124_final_keyword {
    public static void main(String[] args) {
        uni a1=new uni();
        a1.display();

    }
}
class uni{
    final String name="UAP";
    final int fee;
    static int year;
    uni(){
        fee=85000;
    }
    static{
        year=4;
    }
    void display(){
        System.out.println("name :"+name);
        System.out.println("fees :"+fee);
        System.out.println("year :"+year);
    }
}
