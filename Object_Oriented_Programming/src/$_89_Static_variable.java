public class $_89_Static_variable {
    public static void main(String[] args) {
        student5 s1=new student5("mohammad",19101019);
        s1.display();
        student5 s2=new student5("jonayed",19101019);
        s2.display();
    }
}
class student5{
    String name;
    int id;
    static String uni="UAP";
    student5(String n,int i){
        name=n;
        id=i;
    }
    void display(){
        System.out.println("name:"+name);
        System.out.println("id:"+id);
        System.out.println("University name:"+uni);
        System.out.println();
    }
}

