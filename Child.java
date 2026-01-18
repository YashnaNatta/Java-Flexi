class Parent{
    void showParent(){
        System.out.println("This is a Parent Class");
    }
}
class Child extends Parent{
    void showChild(){
        System.out.println("This is child class");
    }
    public static void main(String[] args){
        Child obj = new Child();
        obj.showParent();
        obj.showChild();
    }
}