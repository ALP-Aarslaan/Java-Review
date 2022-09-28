public class $_131_1_problem_solving_abstract_class {
    public static void main(String[] args) {
        shape3 s1;
        s1=new triangle3(10,20);
        s1.area();
        s1=new rectangle3(10,20);
        s1.area();
        s1=new circle3(10);
        s1.area();
    }
}
abstract class shape3{
    double dim1,dim2;
    shape3(double dim1,double dim2){
        this.dim1=dim1;
        this.dim2=dim2;
    }
    abstract void area();
}
class triangle3 extends shape3{
    triangle3(double dim1,double dim2){
        super(dim1,dim2);
    }
    void area(){
        double result=dim1*dim2*0.5;
        System.out.println("area of triangle : "+result);
    }
}
class rectangle3 extends shape3{
    rectangle3(double dim1,double dim2){
        super(dim1,dim2);
    }
    void area(){
        double result=dim1*dim2;
        System.out.println("area of rectangle : "+result);
    }
}
class circle3 extends shape3{
    circle3(double dim1){
        super(dim1,dim1);
    }
    void area(){
        double result=Math.PI*dim1*dim1;
        System.out.println("area of circle : "+result);
    }
}