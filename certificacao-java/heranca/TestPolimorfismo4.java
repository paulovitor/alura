import java.io.*;
class B {
    void x(double i) throws IOException {
        System.out.println("c");
    }
}
class C {
    void x(int i) throws FileNotFoundException {
        System.out.println("b");
    }
}
class A {
    public static void main(String[] args) throws IOException {
        new C().x(3.2); // não compila! C não possui método que receba double
    }
}