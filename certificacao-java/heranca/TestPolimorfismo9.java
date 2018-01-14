import java.io.*;
class B {
    void x(int i) throws IOException {
        if(i<0) return;
        super.x(-1); // não compila! método x não existe na classe pai (Object)
        System.out.println("c");
    }
}
abstract class C extends B {
    void x(int i) throws IOException {
        System.out.println("b");
        super.x(i);
    }
}
abstract class D extends C {
    void x(int i) throws IOException {
        super.x(i);
    }
}
class E extends D {
}
class A {
    public static void main(String[] args) throws IOException {
        new E().x(32);
    }
}