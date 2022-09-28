public class $_102_1_rubByValue_RunByReference {
    public static void main(String[] args) {
        test1 ob1=new test1();
        int a=10;
        System.out.println("a before call:"+a);
        ob1.change(a);
        System.out.println("a after call:"+a);
        test2 ob2=new test2();
        String name="mohammad";
        System.out.println("name before call:"+name);
        ob2.change(name);
        System.out.println("name after call:"+name);
    }
}
class test1{
    void change(int a){
        a=20;
    }
}
class test2{
    void change( String name){
        name="Jonayed";
    }
}