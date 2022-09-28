public class $_122_1_this_keyword {
    public static void main(String[] args) {
        personJ p1=new personJ("mohammad",22);
        p1.display();
        System.out.println();
        personJ p2=new personJ("Jonayed",22,5.75);
        p2.display();
    }
}
class personJ{
    String name;
    int age;
    double height;
    personJ(String name,int age){
        this.name=name;
        this.age=age;
    }
    personJ(String name,int age,double height){
        this(name,age);
        this.height=height;
    }
    void display(){
        System.out.println("name : "+name);
        System.out.println("age : "+age);
        System.out.println("height : "+height);
    }
}