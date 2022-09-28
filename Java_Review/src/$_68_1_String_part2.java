public class $_68_1_String_part2 {
    public static void main(String[] args) {
        String firstName="mohammad";
        String lastName=" jonayed";
        String fullName=firstName+lastName;
        System.out.println("full name:"+fullName);
        String name=firstName.concat(lastName);
        System.out.println(name);
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        boolean b=name.endsWith("ed");
        System.out.println(b);
        boolean c=name.startsWith("mo");
        System.out.println(c);
        String names[]={"mohammad","jonayed","sarkar"};
        for(String x:names){
            System.out.print(" "+x);
        }
    }
}
