interface Z {}
interface W {}
interface Y extends Z, W {}
class B {}
class C extends B implements Y {}
class D extends B implements Z, W {}
class E extends C {}
class A {
    public static void main(String[] args) {
        Z z = (Z) (B) new D(); // Compila, pois apesar de B não implementar Z, um subtipo dele pode (e na prática já o faz) implementá-lo. Ao rodar não dá exception nenhuma
    }
}