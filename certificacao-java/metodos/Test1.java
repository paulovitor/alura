class A {
    public static void main(String[] args) {
        x(args.length);
    }
    static int x(final int l) {
        for(int i=0;i<100;i++) {
            switch(i) {
                case l: // valor não constante
                    System.out.println(l);
                    if(l==i) return; // precisa retornar um inteiro
                case 0:
                    System.out.println(0);
            }
        }
        System.out.println("Fim");
        return -1;
    }
}