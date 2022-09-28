public class $_105_1_factorial_using_recursion {
    public static void main(String[] args) {
        fact ob1=new fact();
        int result=ob1.factorial(5);
        System.out.println("result:"+result);
    }
}
class fact{
    int factorial(int n){
        if(n==1)
            return 1;
        else
            return n*factorial(n-1);
    }
}
