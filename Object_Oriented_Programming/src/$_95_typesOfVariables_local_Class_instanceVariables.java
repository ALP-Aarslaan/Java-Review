public class $_95_typesOfVariables_local_Class_instanceVariables {
    public static void main(String[] args) {
        /*
        there are three types of variables:
        1.instance variables,
        2.local variables
        3.static  or class variables
         */
        /*
        instance variables are declared inside a class
        we can use these inside any where of a class
         */
        /*
        local variables are used inside of a method and we cant use these anywhere
        else and a method is also inside of a class though we cant use these local
        variables in the class we have to use these inside the method
         */
        /*
        static variables are easily findable because these variables starts
        with static keyword
         */
        variableTypes ob1=new variableTypes(22,"mohammad");
        ob1.display();
        System.out.println(variableTypes.age);

    }
}
class variableTypes{
    int number;//instance variable
    String name;//instance variables
    variableTypes(int n,String nam)//these are local variables
    {
        name=nam;
        number=n;
    }
    void display(){
        System.out.println("name:"+name);
        System.out.println("age:"+number);
    }
    static int age=22;//this is static variable
}
