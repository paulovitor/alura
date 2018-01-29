// Um pacote pode ter nome começando com maiúsculo, isso não afeta em nada. Mas não é o padrão
package A;
// Uma classe não precisa ser pública para ser rodada
class B{
	// O nome de variáveis locais e parâmetros não afetam a assinatura de um método em Java
    public static void main(String[] a) {
        System.out.println("rodei");
    }
}