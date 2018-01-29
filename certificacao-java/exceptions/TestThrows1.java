import java.io.*;
class X {
    InputStream y() throws NOME_AQUI { // java.io.IOException
        return new FileInputStream("a.txt");
    }
    void z() throws NOME_AQUI{ // java.io.IOException
        InputStream is = y();
        is.close();
    }
}