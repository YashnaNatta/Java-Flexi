class Parent {
    String name = "Parent Class";

    Parent() {
        System.out.println("Parent constructor called");
    }

    void show() {
        System.out.println("This is Parent method");
    }
}

class Child extends Parent {
    String name = "Child Class";

    Child() {
        super(); // calls parent constructor
        System.out.println("Child constructor called");
    }

    void display() {
        System.out.println("Using this keyword: " + this.name);
        System.out.println("Using super keyword: " + super.name);

        this.show();   // calling parent method (inherited)
        super.show();  // explicitly calling parent method
    }
}

public class SuperThisDemo {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}
