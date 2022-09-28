public class $_128_polymorphism {
    public static void main(String[] args) {
        shape s=new shape();
        System.out.println(s.area());
        rectangle r=new rectangle(10,20);
        System.out.println(r.area());
        triangle t=new triangle(10,20);
        System.out.println(t.area());
    }
}
class shape{
    double area(){
        return 0;
    }
}
class rectangle extends shape{
    double height,length;
    rectangle(double height,double length){
        this.height=height;
        this.length=length;
    }
    double area(){
        System.out.println("area of rectangle:");
        return height*length;
    }
}
class triangle extends shape{
    double base,height;
    triangle(double base,double height){
        this.base=base;
        this.height=height;
    }
    double area(){
        System.out.println("area of triangle:");
        return 0.5*base*height;
    }
}
