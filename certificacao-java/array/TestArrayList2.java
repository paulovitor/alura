import java.util.ArrayList;
class A {
    public static void main(String[] args) {
        ArrayList<String> c = new ArrayList<String>();
        c.add("a");
        c.add("c");
        System.out.println(c.remove("a")); // true
    }
}