public class $_32_1_Break_and_Continue {
    public static void main(String[] args) {
        for(int i=1;i<=20;i++){
            if(i==11)
                break;
            System.out.print(i+"\t");
        }
        System.out.println();
        for(int i=1;i<=20;i++){
            if(i==11){
                continue;
            }
            System.out.print(i+"\t");
        }
    }
}
