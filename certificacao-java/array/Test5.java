class A {
    public static void main(String[] args) {
        int x[] = new int[3];
        for(x[1]=x.length-1;x[0]==0;x[1]--) { // x[1] = 2, x[2] = -5 | x[1] = 1, x[1] = -5 (index negativo, erro de execução)
            x[x[1]]=-5;
            System.out.println(x[1]);
        }
    }
}