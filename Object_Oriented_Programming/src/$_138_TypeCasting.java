public class $_138_TypeCasting {
    public static void main(String[] args) {
        int x=10;
        double y=x;
        System.out.println("y = "+y);
        double d=10.78;
        int i=(int)d;
        System.out.println("i : "+i);
        AA ob1=new BB();
        ob1.display();
        BB ob2=(BB)new AA();//typeCasting(BB)
        ob2.display();//this type of casting doesnt supported by java
    }
}
class AA{
    void display(){
        System.out.println("i am super class");
    }
}
class BB extends AA{
    void display(){
        System.out.println("i am sub class");
    }
}

