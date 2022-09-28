public class $_107_encapsulation {
    public static void main(String[] args){
        person5 p1=new person5();
        p1.setName("Mohammad Jonayed Sarkar");
        p1.setAge(22);
        System.out.println(p1.getAge());
        System.out.println(p1.getName());

    }
}
class person5{
    private String name;
    private int age;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
}