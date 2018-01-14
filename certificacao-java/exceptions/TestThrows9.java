class MyException extends RuntimeException {

}
class A {
    void m2() throws java.io.FileNotFoundException {
        System.out.println("e");
        throw new MyException(); // O código não compila
        System.out.println("f"); // não pode ter nenhum código abaixo desse throw e o compilador verifica isso
    }
    void m() throws java.io.FileNotFoundException {
        System.out.println("c");
        try {
            m2();
        } catch(java.io.FileNotFoundException ex) {
        }
        System.out.println("d");
    }
    public static void main(String[] args) throws 
    java.io.IOException {
        System.out.println("a");
        new A().m();
        System.out.println("b");
    }
}