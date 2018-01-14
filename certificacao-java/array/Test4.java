class A {
    public static void main(String[] args) {
        int x[] = new int[3];
        for(int i=x.length;i>=0;i--) x[i]=i*2; // erro em execução, acessa uma posição inexistente, pois x começa com 3
        System.out.println("Fim!");
    }
}