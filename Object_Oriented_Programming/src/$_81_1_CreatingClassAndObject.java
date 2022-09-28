public class $_81_1_CreatingClassAndObject {
    public static void main(String[] args) {
        student student1=new student();
        student1.name="mohammad jonayed sarkar";
        student1.age=22;
        student1.gender="male";
        System.out.println("student name: "+student1.name);
        System.out.println("student gender: "+student1.gender);
        System.out.println("student age: "+student1.age);
    }
}
class student{
    String name,gender;
    int age;

}
