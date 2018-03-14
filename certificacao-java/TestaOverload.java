class Overloader {
	public void metodo2(String s) {
		System.out.println("com string");
	}
	public void metodo2(Object o) {
		System.out.println("com object");
	}
	public void metodo3(String a, int b) {
		System.out.println("String,int");
	}
	public void metodo3(int b, String a) {
		System.out.println("int,String");
	}
	public void metodo4(int a, double b) {
		System.out.println("int,double");
	}
	public void metodo4(double b, int a) {
		System.out.println("double,int");
	}
	public void metodo5(String b, Object a) {
		System.out.println("String,Object");
	}
	public void metodo5(Object a, String b) {
		System.out.println("Object,String");
	}
	public void metodo6(Object b, Object a) {
		System.out.println("Object,Object");
	}
	void metodo6(String a, String b) {
		System.out.println("String,String");
	}
	public int metodo7() {
		return 1;
	}
	public short metodo7(int a) {
		return 1;
	}
	public void metodo(int a) {
		System.out.println("com int");
	}
	public void metodo(double a) {
		System.out.println("com double");
	}
	public void metodo() {
		System.out.println("sem nada");	
	}
}
class TestaOverload {
	public static void main(String[] args) {
		// new Overloader().metodo5("guilherme", "joao"); // error: reference to metodo5 is ambiguous

		new Overloader().metodo6("guilherme", "guilherme");
		new Overloader().metodo6(new Carro(), new Carro());
		new Overloader().metodo6("guilherme", new Object());

		new Overloader().metodo4(3, 5.2);
		new Overloader().metodo4(5.2, 3);
		// new Overloader().metodo4(4, 3); // Erro de compilação chamada ambigua, o compilador não sabe qual dos métodos chamar

		new Overloader().metodo2("guilherme");
		new Overloader().metodo2((Object) "guilherme");
		new Overloader().metodo2(new Object());

		new Overloader().metodo();
		new Overloader().metodo((short) 123);
		new Overloader().metodo(423);
		new Overloader().metodo((float) 123);
		new Overloader().metodo(423.3);
	}
}