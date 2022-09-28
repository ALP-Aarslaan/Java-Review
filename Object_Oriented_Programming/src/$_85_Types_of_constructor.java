public class $_85_Types_of_constructor {
    public static void main(String[] args) {
        teacher3 t1=new teacher3();
        t1.display();
        teacher3 t2=new teacher3("mohammad","male",22);
        t2.display();
    }
}
class teacher3{
    String name,gender;
    int age;
    teacher3(String n,String g,int a){
        name=n;
        age=a;
        gender=g;
    }
    teacher3(){
        System.out.println("no value");
    }
    void display(){
        System.out.println("name:"+name);
        System.out.println("age:"+age);
        System.out.println("gender:"+gender);
        System.out.println("\n");
    }
}

