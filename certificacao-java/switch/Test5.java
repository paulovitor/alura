class A {
    public static void main(String[] args) {
        switch(10) {
            case < 10: // case não aceita expressões como < x 
                System.out.println("menor");
            default:
                System.out.println("igual");
            case > 10:
                System.out.println("maior");
        }
    }
}