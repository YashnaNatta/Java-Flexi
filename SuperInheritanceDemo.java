class Parent {
    String name = "Rahul";
    int age = 50;

    void showParentDetails() {
        System.out.println("Parent Name: " + name);
        System.out.println("Parent Age: " + age);
    }
}

class Child extends Parent {
    String name = "Yash";

    void display() {
        // accessing parent properties using super
        System.out.println("Child Name: " + this.name);
        System.out.println("Parent Name using super: " + super.name);

        // calling parent method using super
        super.showParentDetails();
    }
}

public class SuperInheritanceDemo {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}
