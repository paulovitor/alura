package financeiro;
public class ContaFinanceira extends modelo.Conta {
    void fecha() {
        System.out.println("fechando financeiro");
    }
}


package modelo;
public class Conta {
    void fecha() {
        System.out.println("fechando conta normal");
    }
}


package codigo;
import modelo.*;
import financeiro.*;
class A {
    public static void main(String[] args) {
        new Conta().fecha(); // não compila! método fecha de Conta é default
    }
}