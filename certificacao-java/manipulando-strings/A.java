class A{
    public static void main(String [] args){
        String s = "aba";
        for(int i = 0; i < 9; i++) {
            s = s +"aba";
        }
        // Não compila, pois length() é um método de String
        System.out.println(s.length);
    }
}