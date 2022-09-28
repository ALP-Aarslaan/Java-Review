public class $_85_1_Types_of_constructor {
    public static void main(String[] args) {
        student3 s1=new student3("mohammad","male",22);
        s1.display();
        student3 s2=new student3();
        s2.display();
    }
}
class student3{
    String name,gender;
    int age;
    student3(String n,String g,int a){
        name=n;
        gender=g;
        age=a;
    }
    student3(){
        System.out.println("null value");
    }
    void display(){
        System.out.println("name:"+name);
        System.out.println("gender:"+gender);
        System.out.println("age:"+age);
        System.out.println();
    }
}
