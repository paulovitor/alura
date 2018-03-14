import java.io.*;
class B {
    void x(int i) throws IOException {
        System.out.println("c");
    }
}
abstract class C extends B  {
    abstract void x(int i) throws IOException;
}
abstract class D extends C {
    void x(int i) throws IOException {
        System.out.println("d");
    }
}
class E extends D {
}
class A {
    public static void main(String[] args) throws IOException {
        new E().x(32); // d
    }
}