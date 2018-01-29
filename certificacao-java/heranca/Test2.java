import java.io.*;
    class Veiculo {
        protected void liga () throws IOException {}
    }
    class Carro extends Veiculo {
        public void liga() throws FileNotFoundException {} // FileNotFoundException é subclasse de IOException
    }