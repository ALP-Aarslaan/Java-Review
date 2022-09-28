public class $_84_1_Constructor {
    public static void main(String[] args) {
        student2 s1=new student2("mohammad","male",22);
        s1.display();
        student2 s2=new student2("jonayed","male",22);
        s2.display();
    }
}
class student2{
    String name,gender;
    int age;
    student2(String n,String g,int a){
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
