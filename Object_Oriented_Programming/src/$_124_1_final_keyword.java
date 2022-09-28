public class $_124_1_final_keyword {
    public static void main(String[] args) {
        institution i1=new institution();
        i1.display();
    }
}
class institution{
    final String name="IPSC";
    static final int fee;
    final int year;
    institution(){
        year=5;
    }
    static{
        fee=1500;
    }
    void display(){
        System.out.println("name :"+name);
        System.out.println("year :"+year);
        System.out.println("fees :"+fee);
    }

}
