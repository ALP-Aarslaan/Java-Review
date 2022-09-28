public class $_97_instance_variable_hiding {
    public static void main(String[] args) {
        box1 ob1=new box1(10,10,10);
        ob1.displayVol();
    }
}
class box1{
    double height,width,depth;
    box1(double height,double width,double depth){
        this.height=height;
        this.width=height;
        this.depth=depth;
    }
    void displayVol(){
        double volume=height*width*depth;
        System.out.println("volume:"+volume);
    }
}
