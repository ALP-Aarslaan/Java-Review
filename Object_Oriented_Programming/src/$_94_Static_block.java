public class $_94_Static_block {
    static int id;
    static String name;
    static{
        id=19101019;
        name="Mohammad Jonayed Sarkar";
        display();//in this case static method will run first then main method
    }
    static void display(){
        System.out.println("id:"+id);
        System.out.println("name:"+name);

    }

    public static void main(String[] args) {
        System.out.println("this is main method");
    }

}
