public class $_83_1_Parameterized_method {
    public static void main(String[] args) {
        student1 s1=new student1();
        s1.setInfo("Mohammad","male",22);
        s1.display();
        student1 s2=new student1();
        s2.setInfo("Jonayed","female",22);
        s2.display();
    }
}
class student1{
    String name,gender;
    int age;
    void setInfo(String n,String g,int a){
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
