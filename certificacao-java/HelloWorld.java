public class HelloWorld {
	
	public static void main(String params[]) {
		System.out.println("rodando o programa");
		System.out.println(params.length);
		for (int i = 0; i < params.length; i++) {
			System.out.println(i + " => " + params[i]);
		}
	}
}