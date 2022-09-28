public class $_141_Exception_handling {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println("Result = " + result);
        } catch (ArithmeticException e1) {
            System.out.println(e1);
        } catch (Exception e2) {
            System.out.println(e2);
        } finally {
            System.out.println("Last line of code");
        }
    }
}
