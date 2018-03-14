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


package modelo;
import modelo.*;
import financeiro.*;
class A {
    public static void main(String[] args) {
        new Conta().fecha(); // fechando conta normal
    }
}