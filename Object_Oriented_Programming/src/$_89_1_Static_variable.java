public class $_89_1_Static_variable {
    public static void main(String[] args) {
        teacher5 t1=new teacher5("mohammad",22);
        t1.display();
        teacher5 t2=new teacher5("jonayed",22);
        t2.age=23;
        t2.name="sarkar";
        t2.display();
    }
}
class teacher5{
    String name;
    int age;
    static String department="CSE";
    teacher5(String n,int a){
        name=n;
        age=a;
    }
    void display(){
        System.out.println("name:"+name);
        System.out.println("age:"+age);
        System.out.println("Department:"+department);
        System.out.println();
    }
}
