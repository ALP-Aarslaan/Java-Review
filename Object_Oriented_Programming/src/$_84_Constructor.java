public class $_84_Constructor {
    public static void main(String[] args) {
        teacher2 t1=new teacher2("mohammad","Male",22);
        t1.display();
        teacher2 t2=new teacher2("jonayed","male",22);
        t2.display();
    }
}
class teacher2{
    String name,gender;
    int age;
    teacher2(String n,String g,int a){
        name=n;
        gender=g;
        age=a;
    }
    void display(){
        System.out.println("name:"+name);
        System.out.println("gender:"+gender);
        System.out.println("age:"+age);
        System.out.println("\n");
    }
}
