interface Printer{
    void printMessage();
}

class A {
    public static void main(String[] args) {
        Printer p = null;
        //code here (p = () -> System.out.println("Hello World");)
        p.printMessage();
    }
}