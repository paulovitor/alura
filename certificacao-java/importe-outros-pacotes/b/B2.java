package b;
import a.A3;
// import static é o uso adequado
static import a.A3.*;
class B{
    void m() {
        A3 a = new A3();
        a.executa(VALOR);
    }
}