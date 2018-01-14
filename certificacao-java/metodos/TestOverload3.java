class A {
    public static void main(String[] args) {
        System.out.println("[]");
    }
    public static void main(String... args) { // execução ambígua
        System.out.println("...");
    }
}