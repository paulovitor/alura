class A {
    public static void main(String[] args) {
        String nome = null;
        try {
            nome.toLowerCase();
            System.out.print("a");
        } catch(NullPointerException ex) {
            System.out.print("b");
        } finally {
            System.out.print("c");
        }
        System.out.println("d");

        // bcd
    }
}