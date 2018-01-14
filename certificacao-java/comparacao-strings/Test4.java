class B extends C{}
    class C {
        int x;
        public boolean equals(C c) { // sobrecarga (não sobrescrita de equals de Object - assinatura diferente)
            return c.x==x;
        }
    }
    class A {
        public static void main(String[] args) {
            C a = new C();
            C b = new B();
            a.x = 1;
            b.x = 1;
            System.out.println(a==b);
            System.out.println(a.equals(b)); // as duas referências são do tipo C
        }
    }