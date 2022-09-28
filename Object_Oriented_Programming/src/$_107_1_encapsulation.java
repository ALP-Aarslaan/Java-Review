public class $_107_1_encapsulation{
    public static void main(String[] args) {
        persons1 p1=new persons1();
        p1.setName("Mohammad");
        String name=p1.getName();
        System.out.println("name:"+name);
        p1.setAge(22);
        int age=p1.getAge();
        System.out.println("age:"+age);
    }
}
class persons1{
    private String name;
    private int age;
    public void setName(String n){
        name=n;
    }
    public void setAge(int a){
        age=a;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
