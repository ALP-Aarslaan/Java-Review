import org.w3c.dom.ls.LSOutput;

public class $_112_Instance_of_operator {
    public static void main(String[] args) {
        animal ob1=new animal();
        human ob2=new human();
        man ob3=new man();
        System.out.println(ob1 instanceof animal);
        System.out.println(ob2 instanceof animal );
        System.out.println(ob3 instanceof human);
        System.out.println(ob3 instanceof man);
        System.out.println(ob2 instanceof man );

    }
}
class animal{
}
class human extends animal{

}
class man extends human{

}
