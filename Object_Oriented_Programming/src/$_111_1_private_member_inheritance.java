public class $_111_1_private_member_inheritance {
    public static void main(String[] args) {
        students4 s1=new students4();
        s1.setName("mohammad jonayed");
        s1.setAge(22);
        s1.display();
    }
}
class students3{
    private String name;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}
class students4 extends students3{
    private int age;
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    void display(){
        System.out.println(getName());
        System.out.println(getAge());
    }
}