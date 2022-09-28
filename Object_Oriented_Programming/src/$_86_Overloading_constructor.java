public class $_86_Overloading_constructor {
    public static void main(String[] args) {
        teacher4 t1=new teacher4();
        t1.display();
        teacher4 t2=new teacher4("mohammad","male",22);
        t2.display();
        teacher4 t3=new teacher4("jonayed","male");
        t3.display();
    }
}
class teacher4{
    String name,gender;
    int age;
    teacher4(){
        System.out.println("no information");
    }
    teacher4(String n,String g){
        name=n;
        gender=g;
    }
    teacher4(String n,String g,int a){
        name=n;
        gender=g;
        age=a;
    }
    void display(){
        System.out.println("name:"+name);
        System.out.println("gender:"+gender);
        System.out.println("age:"+age);
        System.out.println();
    }
}