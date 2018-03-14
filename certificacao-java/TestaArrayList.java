import java.util.ArrayList;

public class TestaArrayList {
	public static void main(String args[]) {
		String[] nomesArrayString = new String[10]; // precisa definir o tamanho na inicialização

		// Declaração obrigatório somente na declaração de ArrayList<String> 
		ArrayList<String> nomes = new ArrayList<>(); // internamente possui um objeto array

		nomes.add("java"); // sempre inclui no final do ArrayList
		nomes.add("ruby");
		nomes.add("java"); // ArrayList aceita duplicação

		System.out.println(nomes.contains("java")); // verifica se ojbeto existe
		System.out.println(nomes.contains("c#"));

		boolean removido = nomes.remove("java"); // remove a primeira ocorrência do objeto
		System.out.println(removido);
		System.out.println(nomes.contains("java"));

		System.out.println(nomes.size());

		Object[] objetos = nomes.toArray(); // toArray default, retorna um array de Object

		String[] nomesArray = nomes.toArray(new String[nomes.size()]); // copia os elementos do ArrayList para o array de String que está sendo passado como parâmetro para o método
		String[] nomesArray2 = nomes.toArray(new String[0]); // Verifica se array passado tem tamanho suficiente, caso não tenha internamente o ArrayList cria um novo array com o tamanho necessário

		ArrayList<String> paises = new ArrayList<>();
		paises.add("Brasil");
		paises.add("Coreia");

		ArrayList<String> tudo = new ArrayList<>();
		tudo.addAll(nomes); // add os elementos de outro ArrayList
		tudo.addAll(paises);
		System.out.println(tudo.size());

		System.out.println(nomes.get(0)); // get recebe o index e começa em 0

		nomes.add(0, "php"); // Inclui o elemento da posição 0 e desloca os outros elementos para frente
		System.out.println(nomes.get(0));
		System.out.println(nomes.get(1));

		nomes.remove(0); // remove o elemento da posição 0
		System.out.println(nomes.get(0));

		nomes.set(0, "scala"); // troca o elemento que está na posição 0 pelo que está sendo incluido, então o antigo elemento vai para o final
		System.out.println(nomes.get(0));
		System.out.println(nomes.get(1));

		System.out.println(nomes.indexOf("java")); // retorna o index da primeira ocorrência daquele elemento
		System.out.println(nomes.lastIndexOf("java")); // retorna o index da última ocorrência daquele elemento

		System.out.println(nomes.indexOf("c#")); // caso não encontre o elemento retorna -1
	}
}