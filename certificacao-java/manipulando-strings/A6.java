class A6 {
    public static void main(String[] args) {
        String s = null;
        // Erro de execução, NullPointerException ao tentar criar a segunda String
        String s2 = new String(s);
        System.out.println(s2);
    }
}