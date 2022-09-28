public class $_82_1_creatingMethod {
    public static void main(String[] args) {
        persons p1=new persons();
        p1.gender="male";
        p1.age=22;
        p1.name="mohammad jonayed sarkar";
        p1.display();
    }
}
class persons{
    String name,gender;
    int age;
    void display(){
        System.out.println("person name:"+name);
        System.out.println("person age:"+age);
        System.out.println("person gender:"+gender);
        System.out.println("\n");
    }
}
