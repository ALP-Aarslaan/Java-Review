public class _81_HowToCreateAClassAndObject {
    public static void main(String[] args) {
        teacher teacher1=new teacher();//creating teacher object
        teacher1.name="mohammad";
        teacher1.gender="male";
        teacher1.age=22;
        System.out.println("name : "+teacher1.name);
        System.out.println("gender : "+teacher1.gender);
        System.out.println("age : "+teacher1.age);
        System.out.println("\n\n");
        teacher teacher2=new teacher();
        teacher2.gender="female";
        teacher2.age=22;
        teacher2.name="Arafin";
        System.out.println("name : "+teacher2.name);
        System.out.println("gender : "+teacher2.gender);
        System.out.println("age : "+teacher2.age);
    }
}
class teacher{//creating teacher class
    String name;
    String gender;
    int age;
}
