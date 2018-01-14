class A {
    public static void main(String[] args) {
        switch(10) {
            case 10:
                System.out.println("a");
                break;
                System.out.println("b"); // O código não compila pois há código que não será executado após break
            default:
                System.out.println("c");
            case 11:
                System.out.println("d");
        }
    }
}