public class $_102_runByValue_runByReference {
    public static void main(String[] args) {
        CallByValue ob1=new CallByValue();
        int x=20;
        System.out.println("x before call:"+x);
        ob1.change(x);
        System.out.println("x after call:"+x);
        callByReference r1=new callByReference();
        r1.name="jonayed";
        System.out.println("r1 before call:"+r1.name);
        r1.change(r1);
        System.out.println("r1 after call:"+r1.name);
    }
}
class CallByValue{
    void change(int i){
        i=10;
    }
}
class callByReference{
    String name;
    void change(callByReference r2){
        r2.name="mohammad";
    }
}
