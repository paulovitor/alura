package b;
//  não compila pois tenta acessar uma classe do pacote padrão (sem nome)
import static A.*;
class B{
    void m() {
        A a = new A();
        a.executa(VALOR);
    }
}