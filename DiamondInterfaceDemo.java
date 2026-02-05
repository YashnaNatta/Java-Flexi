
interface A {
    void show();
}
interface B {
    void show();
}

class Demo implements A, B {

    
    public void show() {
        System.out.println("Diamond problem solved using interfaces");
    }
}

public class DiamondInterfaceDemo {
    public static void main(String[] args) {

        Demo obj = new Demo();
        obj.show();
    }
}
