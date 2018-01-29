package b;
import static a.A2.*;
class B{
    void m() {
    	// Não importamos a classe A
        A2 a = new A2();
        a.executa(VALOR);
    }
}