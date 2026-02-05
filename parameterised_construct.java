import java.util.Scanner;

class Calculator {
    int num1, num2;

    // Parameterised Constructor
    Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    void calculate(int choice) {
        switch(choice) {
            case 1:
                System.out.println("Sum = " + (num1 + num2));
                break;
            case 2:
                System.out.println("Subtraction = " + (num1 - num2));
                break;
            case 3:
                System.out.println("Multiplication = " + (num1 * num2));
                break;
            case 4:
                if(num2 != 0)
                    System.out.println("Division = " + (num1 / (double)num2));
                else
                    System.out.println("Cannot divide by zero");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        Calculator c = new Calculator(a, b);

        System.out.println("\n1. Sum");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        c.calculate(choice);

        sc.close();
    }
}
