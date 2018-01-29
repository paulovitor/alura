public class Testes {
    public static void main(String[] args) {
        System.out.println(new char[]{'a','b','c'}); // A // abc
        System.out.println(new byte[]{'a','b','c'}); // B // [B@135fbaa4
        System.out.println("abc"); // C // abc
        System.out.println(new String[]{"abc"}); // D // [Ljava.lang.String;@45ee12a7
    }
}