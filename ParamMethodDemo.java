class Calculator {

    // Parameterised Method
    void add(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }
}

public class ParamMethodDemo {
    public static void main(String[] args) {

        Calculator c = new Calculator();

        // ✅ If command line values are given
        if (args.length == 2) {
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);
            c.add(x, y);
        }
        // ✅ Otherwise use predefined values
        else {
            System.out.println("Using predefined values:");
            c.add(10, 20);
        }
    }
}
