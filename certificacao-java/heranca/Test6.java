class B { private B() {} static B B(String s) 
          { return new B(); } }
class A extends B { // não compila! A não tem acesso ao construtor de B
    public static void main(String[] args) {
        B b = B.B("t");
    }
}