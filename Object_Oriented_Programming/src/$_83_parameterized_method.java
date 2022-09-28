public class $_83_parameterized_method {
    public static void main(String[] args) {
        teacher1 t1=new teacher1();
        t1.setInfo("Mohammad","male",22);
        t1.display();
        teacher1 t2=new teacher1();
        t2.setInfo("Jonayed","male",22);
        t2.display();

    }
}
class teacher1{
    String name;
    String gender;
    int age;
    void setInfo(String n,String g,int a){
        name=n;
        gender=g;
        age=a;
    }
    void display(){
        System.out.println("name:"+name);
        System.out.println("age:"+age);
        System.out.println("gender:"+gender);
        System.out.println("\n");
    }
}
