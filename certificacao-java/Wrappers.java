public class Wrappers {
	public static void main(String[] args) {
		Double d1 = new Double(22.5);
		Double d2 = new Double("22.5");
		// Double d3 = new Double("22,7"); // java.lang.NumberFormatException

		Character c1 = new Character('a');
		System.out.println(c1);
		// Character c2 = new Character("a"); // não compila

		Boolean b1 = new Boolean(true);
		Boolean b2 = new Boolean("true"); // true
		Boolean b3 = new Boolean("True"); // true
		Boolean b4 = new Boolean("TruE"); // true
		Boolean b5 = new Boolean("false"); // false
		Boolean b6 = new Boolean("abc"); // false
		Boolean b7 = new Boolean("true "); // false

		// String => primitivo
		Long l = new Long("123");
		long l1 = l.longValue();
		int i = l.intValue();
		double d = l.doubleValue();

		boolean b = new Boolean("T").booleanValue();
		char c = new Character('a').charValue();

		double d20 = Double.parseDouble("123.6");
		int i20 = Integer.parseInt("2");
		// int i30 = Integer.parseInt("adsf"); java.lang.NumberFormatException

		int i21 = Integer.parseInt("10", 10); // base decimal
		int i22 = Integer.parseInt("14", 16); // base hexadecimal
		int i23 = Integer.parseInt("A", 16); // funciona porque temos a letra A na base hexadecimal
		long l20 = Long.parseLong("11", 2); // base binária

		Integer i50 = Integer.parseInt("10");

		// String => Wrapper
		Double d30 = new Double("23.7");
		Double d31 = Double.valueOf("23.7");
		Integer i30 = Integer.valueOf("23");
		Integer i31 = Integer.valueOf("4AF", 16);

		int i32 = Integer.valueOf("23");

		// primitivo => String
		// String d40 = Double.toString(24.6, 10);
		String i40 = Integer.toString(24, 10);

		int a = Integer.parseInt("10",2);
		System.out.println(a);

		// Wrapper => String
		// toString()
	}
}