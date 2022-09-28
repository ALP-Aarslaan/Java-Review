public class $_82_creatingAMethod {
    public static void main(String[] args) {
        person t1=new person();
        t1.age=22;
        t1.gender="male";
        t1.name="mohammad";
        t1.displayInfo();
    }
}
class person{
    String name,gender;
    int age;
    public void displayInfo(){
        System.out.println("teacher name: "+name);
        System.out.println("teacher gender: "+gender);
        System.out.println("teacher age: "+age);
        System.out.println("\n\n");
    }
}

