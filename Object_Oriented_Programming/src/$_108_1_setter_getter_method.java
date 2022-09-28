public class $_108_1_setter_getter_method {
    public static void main(String[] args) {
        encap p1= new encap();
        p1.roll=19101019;
        p1.setName("Sarkar");
        System.out.println(p1.getName());
        p1.display();
    }
}
class encap{
    private String name;
    int roll;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void display(){
        System.out.println("roll number:"+roll);
    }

}
