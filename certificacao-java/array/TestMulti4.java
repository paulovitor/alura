class Teste {
    public static void main(String[] args){
        int[] idades = new int[10];
        idades[0] = 1.0; // erro na atribuição double em array de int 

        int[10][10] tabela = new int[10][10]; // os tamanhos devem ser definidos na inicialização e não na declaração

        int[][][] cubo = new int[][][]; // não foi colocado o tamanho de nenhuma das dimensões
    }
}