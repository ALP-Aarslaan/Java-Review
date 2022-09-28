public class $_103_1_variable_length_arguments {
    public static void main(String[] args) {
        summation a1=new summation();
        a1.add(1,2,3,4,5,6,7,8,9,10);
    }
}
class summation{
    void add(int ...num){
        int sum=0;
        for(int y:num){
            sum=sum+y;
        }
        System.out.println(sum);
    }
}
