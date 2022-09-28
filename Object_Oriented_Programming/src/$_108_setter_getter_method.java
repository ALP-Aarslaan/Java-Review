public class $_108_setter_getter_method {
    public static void main(String[] args) {
        encapsulation p1=new encapsulation();
        p1.age=22;
        p1.setName("jonayed");
        System.out.println(p1.getName());
        p1.display();
    }
}
class encapsulation{
    private String name;
    int age;
    void display(){
        System.out.println("age:"+age);
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}
