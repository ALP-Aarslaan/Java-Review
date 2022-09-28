public class $_122_This_keyword {
    public static void main(String[] args) {
        me m1=new me("mohammad",22);
        m1.display();
        me m2=new me("mohammad",22,5.75);
        m2.display();

    }
}
class me{
    String name;
    int age;
    double height;
    me(String name,int age){
        this.name=name;
        this.age=age;
    }
    me(String name,int age,double height){
        this(name,age);
            this.height=height;
        }
    void display(){
        System.out.println("name : "+name);
        System.out.println("age : "+age);
        System.out.println("height : "+height);
    }
}