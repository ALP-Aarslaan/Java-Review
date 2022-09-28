public class $_94_1_Static_Block {
    public static void main(String[] args) {
        System.out.println("i am main method");
        staticBlock.display();
    }
}
class staticBlock{
    static int num=10;
     static String name;
    static{
        name="mohammad";
    }
    static void display(){
        System.out.println("id:"+num);
        System.out.println("name:"+name);
    }
}