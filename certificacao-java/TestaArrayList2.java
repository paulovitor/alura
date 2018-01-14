import java.util.ArrayList;
import java.util.Iterator;

public class TestaArrayList2 {
	public static void main(String args[]) {
		ArrayList<String> nomes = new ArrayList<>();

		nomes.add("java");
		nomes.add("ruby");
		nomes.add("scala");

		for(String nome : nomes) {
			System.out.println(nome);
		}

		// contains, indexOf, lastIndexOf utilizam o método equals para comparar objetos
		// sobrecarga do equals não atende a esses métodos e sim sobrescrita (mesma assinatura)

		// Iterator não faz parte do pacote default do java
		Iterator<String> it = nomes.iterator(); // objeto que sabe percorrer todos os elementos da collection
		
		while(it.hasNext()) { // têm um próximo? retorna true ou false
			String nome = it.next(); // retorna o elemento atual
			System.out.println(nome);
			it.remove(); // remove o elemento atual
		}

		System.out.println(nomes.size());

		Cliente gui = new Cliente();
		gui.nome = "Guilherme";

		ArrayList<Cliente> clientes = new ArrayList<>();
		clientes.add(gui);
		System.out.println(gui.nome);
		System.out.println(clientes.get(0).nome);

		gui.nome = "Silveira";
		System.out.println(gui.nome);
		System.out.println(clientes.get(0).nome);
	}
}