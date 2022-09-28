public class $_103_variable_length_arguments {
    public static void main(String[] args) {
        add ob1=new add();
        ob1.add(1,2,3,4);
    }
}
class add{
    void add(int ... num){
        int sum=0;
        for(int x:num){
            sum=sum+x;
        }
        System.out.println("summation:"+sum);
    }
}
