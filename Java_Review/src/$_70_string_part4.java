public class $_70_string_part4 {
    public static void main(String[] args) {
        String s1="this is my country";
        String s2[]=s1.split(" ");
        for(String x:s2){
            System.out.println(x);
        }

        String s3=s1.replace('i','j');
        System.out.println(s3);


    }
}
