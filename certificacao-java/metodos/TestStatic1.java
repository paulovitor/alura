class A {
    public static void main(String[] args) {
        x();
    }
    static x() { // falta o retorno
        System.out.println("x");
        y();
    }
    static y() { // falta o retorno
        System.out.println("y");
    }
}