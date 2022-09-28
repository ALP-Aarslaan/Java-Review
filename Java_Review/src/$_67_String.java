public class $_67_String {
    public static void main(String[] args) {
        String a="Mohammad Jonayed";
        String b=new String("Mohammad Jonayed");
        char c[]={'M','o','h','a','m','m','a','d',' ','J','o','n','a','y','e','d'};
        System.out.println(c);
        System.out.println("a="+a);
        System.out.println("b="+b);
        if(b.equals(a)){
            System.out.println("equals");
        }
        else{
            System.out.println("Not equals");
        }
        int length=c.length;
        System.out.println("length of c:"+length);
        System.out.println("length of a:"+a.length());
        if(b.contains(a)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
        boolean contain=b.contains("jonayed");
        System.out.println(contain);
        String s1="mohammad";
        String s2="Mohammad";
        if(s1.equalsIgnoreCase(s2)){
            System.out.println("equals");
        }
    }
}
