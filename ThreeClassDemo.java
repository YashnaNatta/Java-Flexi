class ClassA {
    int a = 10;
}

class ClassB {
    int b = 20;
}

class ClassC {
    int c = 30;
}

public class ThreeClassDemo {
    public static void main(String[] args) {

        // Creating objects
        ClassA obj1 = new ClassA();
        ClassB obj2 = new ClassB();
        ClassC obj3 = new ClassC();

        //wat Accessing variables using objects
        System.out.println("Value from ClassA: " + obj1.a);
        System.out.println("Value from ClassB: " + obj2.b);
        System.out.println("Value from ClassC: " + obj3.c);
    }
}
