public class $_111_private_member_inheritance {
    public static void main(String[] args) {
        students1 s1=new students1();
        s1.setName("mohammad");
        s1.setAge(22);
        students2 s2= new students2();
        s1.display();
        s2.setName("Jonayed");
        s2.setAge(22);
        s2.setDep("CSE");
        s2.display1();
    }
}
class students1{
    private String name;
    private int age;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
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
class students2 extends students1{
    private String dep;
    public void setDep(String dep){
        this.dep=dep;
    }
    public String getDep(){
        return dep;
    }
    void display1(){
        display();
        System.out.println(getDep());
    }
}

