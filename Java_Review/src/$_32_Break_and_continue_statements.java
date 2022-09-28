public class $_32_Break_and_continue_statements {
    public static void main(String[] args) {
        int i;
        for(i=1;i<=100;i++){
            if(i==20)
                break;
            System.out.println(i);
        }
        for(i=1;i<=50;i++){
            if(i==10||i==20){
                continue;
            }
            System.out.println(i);
        }
    }
}
