class A {
    public static void main(String[] args) {
        char c = 65;
        char c2 = -3; // Erro somente nessa linha: char não pode ser negativo
        System.out.println(c + c2);
    }
}