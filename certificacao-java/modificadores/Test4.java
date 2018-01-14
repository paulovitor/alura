package a;
import b.*;
public class A extends B { protected int a(String s) 
                           {return 2;} }


package b;
import a.*;
public class B { public int a(Object s) {return 1;} }


import a.*;
import b.*;
class A {
    public static void main(String[] args) {
        System.out.println(new A().a("a")); // Erro de compilação! cria uma instância da classe atual, que não possui o método "a"
    }
}