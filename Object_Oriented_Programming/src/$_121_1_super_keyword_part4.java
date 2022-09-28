public class $_121_1_super_keyword_part4 {
    public static void main(String[] args) {
        car c1=new car("BMW","black",10);
        c1.display();
    }
}
class vehicle1{
    String name;
    String colour;
    vehicle1(String n,String c){
        name=n;
        colour=c;
    }
    void display(){
        System.out.println("name : "+name);
        System.out.println("Colour : "+colour);
    }
}
class car extends vehicle1{
    double gear;
    car(String n,String c,double g){
        super(n,c);
        gear=g;
    }
    void display(){
        super.display();
        System.out.println("Gear : "+gear);
    }
}
