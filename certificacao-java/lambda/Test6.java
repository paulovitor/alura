class A{
    int a = 0;

    public static void main(String[] args) {
        new A().method(1);
    }        

    private void method(int a) {
        Predicate<Integer> d = a -> a > 0; // A (nome do parâmetro da expressão lambda conflite com variável)

        if(d.test(a)){ // B
            System.out.println(a);
        }
    }
}