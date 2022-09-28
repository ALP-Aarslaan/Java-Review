public class $_86_1_Overloading_constructor {
    public static void main(String[] args) {
        student4 s1=new student4("mohammad","jonayed",22);
        s1.display();
        student4 s2=new student4("jonayed",22);
        s2.display();
        student4 s3=new student4();

    }
}
class student4{
    String name,gender;
    int age;
    student4(String n,String g,int a){
        name=n;
        gender=g;
        age=a;

    }
    student4(String n, int a){
        name=n;
        age=a;
    }
    student4(){
        System.out.println("no information");
    }
    void display(){
        System.out.println("name:"+name);
        System.out.println("age:"+age);
        System.out.println("gender:"+gender);
    }
}