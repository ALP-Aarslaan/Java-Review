public class $_120_callingConstructorUsing_superKeyword {
    public static void main(String[] args) {
        f ob =new f();

    }
}
class e{
    e(){
        System.out.println("constructor of e");
    }
}
class f extends e{
    f(){
        super();//we have to use super keyword here
        System.out.println("constructor of f");
        //we cant use super keyword here
    }
}
