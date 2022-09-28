public class $_141_1_ExceptionHandling {
    public static void main(String[] args) {
        try{
            int a[]=new int[4];
            a[4]=10;
            System.out.println(a[4]);
        }catch(Exception e1){
            System.out.println(e1);
        }finally {
            System.out.println("Last line of code");
        }
    }
}
