import java.io.*;
interface B {
    public void x(double i) throws IOException { // método em interface não tem corpo
        System.out.println("c");
    }
}
class C implements B {
    public void x(int i) throws FileNotFoundException {
        System.out.println("b");
    }
}
class A {
    public static void main(String[] args) throws IOException {
        new C().x(3);
    }
}