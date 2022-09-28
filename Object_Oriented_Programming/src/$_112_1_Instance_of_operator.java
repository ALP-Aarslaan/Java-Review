public class $_112_1_Instance_of_operator{
    public static void main(String[] args) {
        animals a1=new animals();
        insects a2=new insects();
        birds a3=new birds();
        System.out.println(a1 instanceof animals);
        System.out.println(a2 instanceof animals);
        System.out.println(a3 instanceof insects);
        System.out.println(a2 instanceof birds);
    }
}
class animals{

}
class insects extends animals{

}
class birds extends insects{

}
