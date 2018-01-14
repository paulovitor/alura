public class TestaTrataException {
    public static void main(String[] args) {
        String nome = null;
        try {
            nome.toLowerCase();
            // new java.io.FileInputStream("a.txt");
            System.out.println("linha seguinte");
        } catch (RuntimeException ex) { // é obrigatório a declaração do try e do catch
            // cai no bloco catch somente se for parente ou a mesma exception
            System.out.println("peguei a exception");
        } catch (Throwable ex) {
            System.out.println("Throwable");
        // } catch (java.io.IOException ex) { não compila!
        // só pode declarar uma checked exception se o bloco de código explicitar que irá lançar uma exception desse tipo
        }
        System.out.println("terminei");
    }
}