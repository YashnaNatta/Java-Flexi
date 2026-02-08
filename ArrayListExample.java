import java.util.ArrayList;

public class ArrayListExample{
    public static void main(String[]args){
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        System.out.println("Fruits: " + fruits);
        fruits.remove("Banana");
        System.out.println("Fruits after removal: " + fruits);
        System.out.println("Size of fruits list: " + fruits.size());
        System.out.println("Contains apple " + fruits.contains("Apple"));
    }
}