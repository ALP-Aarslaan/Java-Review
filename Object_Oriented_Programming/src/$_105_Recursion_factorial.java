public class $_105_Recursion_factorial {
    public static void main(String[] args) {
        factorial ob1=new factorial();
        int result=ob1.fact(3);
        System.out.println("factorial of given number:"+result);
    }
}
class factorial{
    int fact(int num){
        if(num==1)
            return 1;
        else
            return num*fact(num-1);
    }
}
