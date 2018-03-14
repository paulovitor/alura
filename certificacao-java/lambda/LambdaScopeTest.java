public class LambdaScopeTest {

    public int instanceVar = 1;
    public final int instanceVarFinal = 2;

    public static void main(String[] args) {
        new LambdaScopeTest().test();
    }

    private void test() {
        instanceVar++; // ok
        new Thread(() -> {
            System.out.println(instanceVar); // ok
            instanceVar++; // ok

            System.out.println(instanceVarFinal); // ok
            instanceVarFinal++; // compile error
        }).start();
    }

    private void test2() {
        int unchangedLocalVar = 3;   // effectively final
        final int localVarFinal = 4; // final
        int simpleLocalVar = 0;
        simpleLocalVar = 9; // updated the value

        new Thread(() -> {
            System.out.println(unchangedLocalVar);   // can read 
            System.out.println(localVarFinal);       // can read
            System.out.println(simpleLocalVar); // compile error
        }).start();
    }

    private void test3(String param) {
	    String methodVar = "method"; //not final

	    Predicate<String> a = param -> param.length() > 0; //compile error
	    Predicate<String> b = methodVar -> methodVar.length() > 0; //compile error
	    Predicate<String> c = newVar -> newVar.length() > 0; // ok
	}
}