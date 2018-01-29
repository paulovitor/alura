class A {
    public static void main(String[] args) {
        System.out.println(a(args.length));
    }
    static int a(int l) {
        if(l<10) return b(l); //A
        else return c(); // B (não tem conversão automática)
    }
    static int b(int l) {
        if(l<10) return b(l); // C
        else return c(); // D (não tem conversão automática)
    }
    static long c() { // erro pois deve retornar int
        return 3;
    }
}