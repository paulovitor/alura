class A {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            new Thread(() -> System.out.println(i)).start(); // ::Lambdas:: só podem interagir com variáveis locais caso estas estejam marcadas como final (uma referência imutável)
        }

        // solução
        for(int i = 0; i < 10; i++){
            final int j = i;
            new Thread(() -> System.out.println(j)).start();
        }
    }
}