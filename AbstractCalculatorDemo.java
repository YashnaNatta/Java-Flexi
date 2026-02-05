import java.util.Scanner;

// Abstract class
abstract class Calculator {

    abstract void add(int a, int b);
    abstract void sub(int a, int b);
    abstract void mul(int a, int b);
    abstract void div(int a, int b);
}

// Child class implementing abstract methods
class MyCalculator extends Calculator {

    void add(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }

    void sub(int a, int b) {
        System.out.println("Subtraction = " + (a - b));
    }

    void mul(int a, int b) {
        System.out.println("Multiplication = " + (a * b));
    }

    void div(int a, int b) {
        if (b != 0)
            System.out.println("Division = " + (a / (double)b));
        else
            System.out.println("Cannot divide by zero");
    }
}

public class AbstractCalculatorDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MyCalculator c = new MyCalculator();

        System.out.print("Enter first number: ");
        int x = sc.nextInt();

        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        System.out.println("\n1.Add  2.Sub  3.Mul  4.Div");
        System.out.print("Enter choice: ");
        int ch = sc.nextInt();

        switch(ch) {
            case 1: c.add(x,y); break;
            case 2: c.sub(x,y); break;
            case 3: c.mul(x,y); break;
            case 4: c.div(x,y); break;
            default: System.out.println("Invalid choice");
        }

        sc.close();
    }
}
