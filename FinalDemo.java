// Final class (cannot be inherited)
final class FinalClass {
    void showMessage() {
        System.out.println("This is a final class method");
    }
}

class Parent {

    // final variable
    final int speed = 60;

    // final method (cannot be overridden)
    final void displaySpeed() {
        System.out.println("Final variable speed = " + speed);
    }
}

class Child extends Parent {
    void show() {
        System.out.println("Child class accessing parent properties");
        displaySpeed(); // calling final method
    }
}

public class FinalDemo {
    public static void main(String[] args) {

        Child obj = new Child();
        obj.show();

        FinalClass f = new FinalClass();
        f.showMessage();
    }
}
