public class $_96_problem_solving {
    public static void main(String[] args) {
        box b1=new box(10,10,10);
        b1.displayVol();
        box b2=new box(20,30,10);
        b2.displayVol();
    }
}
class box{
    double height,width,depth;
    box(double h,double w,double d){
        height=h;
        width=w;
        depth=d;
    }
    void displayVol(){
        double result=height*width*depth;
        System.out.println("volume of the box:"+result);
    }
}
