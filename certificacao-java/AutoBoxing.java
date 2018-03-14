public class AutoBoxing {
	public static void main(String[] args) {
		// até o java 1.4 era necessario fazer isso para realizar uma operação de soma
		Integer intWrapper = Integer.valueOf(1);
		int intPrimitivo = intWrapper.intValue();
		intPrimitivo++;
		intWrapper = Integer.valueOf(intPrimitivo);

		// Java 5 (fizeram o autoboxing)
		Integer intWrapperJ5 = Integer.valueOf(1);
		intWrapperJ5++;
	}
}