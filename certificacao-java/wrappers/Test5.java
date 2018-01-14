public class Test {
    public static void main(String[] args) {
        int a = Short.parseShort("126"); // A
        short s = Integer.parseInt("23").shortValue(); //B (parseInt devolve um int e não um Integer)
        double h = Double.valueOf("27").floatValue();  //C
        System.out.println(a + s);
    }
}