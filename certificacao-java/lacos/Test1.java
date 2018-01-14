class A {
    public static void main(String[] args) {
         fora: for(int a=0;a<30;a++)
         for(int b=0;b<1;b++)
         if(a+b==25) continue fora;
         else if(a+b==20) break fora;
         if(a==0) break fora; //  está fora do bloco do for e tenta acessar uma variável definida dentro dele
         else System.out.println(a);
    }
}