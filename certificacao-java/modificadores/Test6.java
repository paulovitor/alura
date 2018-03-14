package a;
import b.*;
public class A extends B { protected int a(String s)
                           {return 2;} }


package b;
import a.*;
public class B { default int a(Object s) {return 1;} } // não é necessário declarar explicitamente o modificador de acesso "default"


import a.*;
import b.*;
class C {
    public static void main(String[] args) {
        System.out.println(new A().a("a"));
    }
}