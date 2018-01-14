package financeiro;
public class ContaFinanceira extends modelo.Conta {
    public void fecha() {
        System.out.println("fechando financeiro");
    }
}


package modelo;
public class Conta {
    public void fecha() {
        System.out.println("fechando conta normal");
    }
}


package codigo;
import financeiro.*;
import modelo.*;
class A {
    public static void main(String[] args) {
        Conta c = new ContaFinanceira();
        c.fecha(); // fechando financeiro
    }
}