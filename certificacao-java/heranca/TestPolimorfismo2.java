import java.io.*;
class B {
    void x() throws IOException {
        System.out.println("c");
    }
}
class C extends B {
    void x() throws FileNotFoundException {
        System.out.println("b");
    }
}
class A {
    public static void main(String[] args) throws IOException {
        new C().x(); // b
    }
}