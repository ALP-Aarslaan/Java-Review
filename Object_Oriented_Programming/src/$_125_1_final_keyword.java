public class $_125_1_final_keyword {
    public static void main(String[] args) {
        student6 s1=new student6();
        student6 s2=new student6();
        s1.display();
        s2.display2();
    }
}
class university{
    final void display(){
        System.out.println("uni info");
    }
}
class student6 extends university{
    void display2(){
        System.out.println("student info");
    }
}