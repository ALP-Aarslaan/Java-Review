public class $_120_1_callingConstructorUsing_super_keyword {
    public static void main(String[] args) {
        f1 ob=new f1();
    }
}
class e1{
    e1(){
        System.out.println("e1's constructor");
    }
}
class f1 extends e1{
    f1(){
        super();
        System.out.println("f1's constructor");
    }
}
