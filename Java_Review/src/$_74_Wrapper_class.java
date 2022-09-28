public class $_74_Wrapper_class {
    public static void main(String[] args) {
        //autoboxing=primitive->object
        int x=10;
        Integer y=new Integer(x);
        System.out.println("y: "+y);
        Integer z=x;
        System.out.println("z: "+z);
        Integer a=Integer.valueOf(x);
        System.out.println(a);
        //unboxing=Object->primitive;
        Float f=new Float(23.56F);
        float g=f.floatValue();
        System.out.println("G:"+g);
        float h=f;
        System.out.println(h);
    }
}
