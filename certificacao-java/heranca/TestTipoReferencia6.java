package financeiro;
public class ContaFinanceira extends modelo.Conta {
    protected void fecha() {
        System.out.println("fechando financeiro");
    }
}


package modelo;
public class Conta {
    protected void fecha() {
        System.out.println("fechando conta normal");
    }
}


package codigo;
import modelo.*;
import financeiro.*;
class A {
    public static void main(String[] args) {
        new Conta().fecha(); // Não compila porque o método fecha() é protected dentro de Conta
    }
}