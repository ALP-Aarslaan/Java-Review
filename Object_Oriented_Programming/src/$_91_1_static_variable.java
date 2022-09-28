public class $_91_1_static_variable {
    public static void main(String[] args) {
        students s1=new students();
        s1.display();
        students s2=new students();
        s2.display();
        students s3=new students();
        s3.display();
        /*
        static variable is used by all objects we create but non static variables are
        used for a single object and they create a  single memory allocation
         */
    }
}
class students{
    static int count=0;
    int num=0;
    students(){
        count++;
        num++;
    }
    void display(){
        System.out.println("number of students:"+count);
        System.out.println("total number:"+num);
    }
    //purpose of this program to find the difference of static and non static variable
}