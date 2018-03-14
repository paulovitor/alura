class A {
    public static void main(String[] args) {
        x(args.length);
    }
    static int x(final int l) {
        for(int i=0;i<100;i++) {
            switch(i) {
                // pois não basta a variável ser final
                case l: // ela tem que ser definida com valor constante (sempre 5, por exemplo)
                    System.out.println(l);
                    if(l==i) return 3;
                case 0:
                    System.out.println(0);
            }
        }
        System.out.println("Fim");
        return -1;
    }
}