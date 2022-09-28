class $_139_anonymousClass {
    public static void main(String[] args) {
        anonymous ob1=new anonymous(){
            @Override
            void display() {
                System.out.println("main class");
            }
        };
        ob1.display();
    }
}
class anonymous{
    void display(){
        System.out.println("anonymous class");
    }
}