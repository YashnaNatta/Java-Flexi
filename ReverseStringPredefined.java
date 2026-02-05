public class ReverseStringPredefined {
    public static void main(String[] args) {
        String str = "hello";

        StringBuilder sb = new StringBuilder(str);
        String reversed = sb.reverse().toString();

        System.out.println("Reversed string: " + reversed);
    }
}
