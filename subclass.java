class Superclass {
    void method() {
        System.out.println("This is superclass method");
    }
}

class Subclass extends Superclass {

    @Override
    void method() {
        System.out.println("This is subclass method");
        throw new ArithmeticException("Exception in subclass");
    }

    public static void main(String[] args) {
        Subclass obj = new Subclass();

        try {
            obj.method();
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}