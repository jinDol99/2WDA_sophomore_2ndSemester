public class equalsTest {
    public static void main(String[] args) {
        String a = "hello";
        String b = new String("hello");
        System.out.println(a == b);
        System.out.println(a.equals(b));
    }   
}