import java.util.ArrayList;
class A {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<String>();
        l.add("a");
        l.add("b");
        l.add(1,"amor");
        l.add(3,"baixinho");
        System.out.println(l);
        String[] array = l.toArray(); // não compila, toArray() default retorna um array de Object
        System.out.println(array[2]);
    }
}