public class $_128_1_polymorphism {
    public static void main(String[] args) {
        shape1 s[]=new shape1[3];
        s[0]=new shape1();
        s[1]=new rectangle1(10,20);
        s[2]=new triangle1(10,20);
        for(int i=0;i<3;i++){
            System.out.println(s[i].area());
        }
    }
}
class shape1{
    double area(){
        System.out.println("null and void");
        return 0;
    }
}
class rectangle1 extends shape1{
    double length,width;
    rectangle1(double length,double width){
        this.length=length;
        this.width=width;
    }
    double area(){
        System.out.println("area of rectangle:");
        return length*width;
    }
}
class triangle1 extends shape1{
    double base,height;
    triangle1(double base,double height){
        this.base=base;
        this.height=height;
    }
    double area(){
        System.out.println("area of triangle:");
        return 0.5*base*height;
    }
}
