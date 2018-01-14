import java.util.ArrayList;
class A {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add("a", 0); // não compila! O certo é a.add(0, "a")
        a.add("b", 0);
        a.add("c", 0);
        a.add("d", 0);
        System.out.println(a.get(0));
        System.out.println(a.get(1));
        System.out.println(a.get(2));
        System.out.println(a.get(3));
    }
}