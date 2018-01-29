public class Test {
    public static void main(String[] args) {
        System.out.printf("%s",12); //A (funciona!)
        System.out.printf("%d",new Integer(321)); //B
        System.out.printf("%d",(short)(byte)(double) 127); //C

        // Compila e executa normalmente
    }
}