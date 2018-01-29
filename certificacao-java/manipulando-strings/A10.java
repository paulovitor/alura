class A10 {
    public static void main(String[] args) {
        String s = "estudando para a certificação";
        // Foram passados uma String e um char, método que não existe
        s.replace("e", 'a'); // "e" => String e 'a' => char
        System.out.println(s);
    }
}