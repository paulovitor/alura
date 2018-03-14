import java.util.ArrayList;
class A {
    public static void main(String[] args) {
        ArrayList<String> c = new ArrayList<String>();
        c.add("a");
        c.add("a");
        System.out.println(c.remove("a")); // true, remove o primeiro elemento igual ao elemento passado
        System.out.println(c.size()); // 1
    }
}