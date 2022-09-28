public class $_131_problem_solving_abstract_class {
    public static void main(String[] args) {
        shape2 s1;
        s1=new triangle2(10,20);
        s1.area();
        s1=new rectangle2(10,20);
        s1.area();
        s1=new circle(10);
        s1.area();
    }
}
abstract class shape2{
    double dim1,dim2;
    shape2(double dim1,double dim2){
        this.dim1=dim1;
        this.dim2=dim2;
    }
    abstract void area();
}
class triangle2 extends shape2{
    triangle2(double dim1,double dim2){
        super(dim1,dim2);
    }
    void area(){
        double result=0.5*dim1*dim2;
        System.out.println("area of triangle : "+result);
    }
}
class rectangle2 extends shape2{
    rectangle2(double dim1,double dim2){
        super(dim1,dim2);
    }
    void area(){
        double result=dim1*dim2;
        System.out.println("area of rectangle : "+result);
    }
}
class circle extends shape2{
    circle(double dim1){
        super(dim1,dim1);
    }
    void area(){
        double result=Math.PI*dim1*dim1;
        System.out.println("area of circle : "+result);
    }
}

