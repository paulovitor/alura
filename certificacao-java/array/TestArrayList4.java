import java.util.ArrayList;
class A {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");list.add("b");
        list.add("a");list.add("c");
        list.add("a");list.add("b");
        list.add("a");
        System.out.println(list.lastIndexOf("b")); // 5
    }
}