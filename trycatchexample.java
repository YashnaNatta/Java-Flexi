public class trycatchexample{
    public static void main(String[] args) {
        int num1=10;
        int num2=0;
        try {
            int result= num1/num2;
            System.out.println("result: " + result); // This will throw an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("error:cannot divide by zero!");
            System.out.println("Caught an exception: " + e.getMessage());
        }
        System.out.println("Program continues after exception handling.");
    }
}