class parent{
    void show(){
        System.out.println("parent show method");
    }
}
class child extends parent{
    void show(){
        System.out.println("child show method");
    }
}
public class DynamicDispatchDemo{
    public static void main(String[] args) {
        parent obj = new child();
        obj.show();
    }
}