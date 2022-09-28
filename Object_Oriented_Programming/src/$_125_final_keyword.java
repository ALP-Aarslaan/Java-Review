public class $_125_final_keyword {
    public static void main(String[] args) {
        stu s1=new stu();
        s1.display();
        stu s2=new stu();
        s2.display1();
    }
}
class uni1{
    final void display(){
        System.out.println("uni info");
    }
}
class stu extends uni1{
    void display1(){
        System.out.println("student info");
    }
}

