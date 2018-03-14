import java.util.ArrayList;
import java.util.List;

class TestaOperadores {

  public static void main(String[] args) {
  	ArrayList<String> lista = new ArrayList<>(); // apartir do java 7 podemos usar o operador diamante <> não precisa especificar o tipo
  	List<String> lista2 = lista; // está copiando a referência

  	// char -> int -> long
  	// byte -> short -> int -> long
  	// float -> double

  	int a = 10;
  	long b = 20;
  	short c = 3;
  	byte d = 4;
  	char h = 65;
  	// char i = -2; // não compila pois char não pode ser negativo

  	// a = b; // não compila
  	// c = a;

  	// c = h; // não compila (precisão diferente)
  	// h = c; // não compila (precisão diferente)

  	double e = 30.0;

  	float f = 40.3f;
  	double g = 40.3f;

  	f = a;
  	f = b;
  	f = c;
  	f = d;

  	g = a;
  	g = b;
  	g = c;
  	g = d;
  }
}