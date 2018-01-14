interface Z {}
interface W {}
interface Y extends Z, W {}
class B {}
class C extends B implements Y {}
class D extends B implements Z, W {}
class E extends C {}
class A {
    public static void main(String[] args) {
    	// D não implementa Y, por isso é lançado um ClassCastException
        D d = (D) (Y) (B) new D(); // Compila e lança exception
    }
}