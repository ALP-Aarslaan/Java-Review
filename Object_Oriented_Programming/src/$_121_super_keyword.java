public class $_121_super_keyword {
    public static void main(String[] args) {
        bus volvo=new bus("green","scania",500);
        volvo.print();
    }
}
class vehicle{
    String name;
    int weight;
    vehicle(String n,int w){
        name=n;
        weight=w;
    }
    void print(){
        System.out.println("name : "+name);
        System.out.println("weight : "+weight);
    }
}
class bus extends vehicle{
    String colour;
    bus(String c,String n,int w){
        super(n,w);
        colour=c;
    }
    void print(){
        super.print();
        System.out.println("Colour : "+colour);
    }
}