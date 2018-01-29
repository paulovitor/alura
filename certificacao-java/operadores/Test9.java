class $_o0o_$ {
    public static void main(String[] args) {
        int $$ = 5;
        int __ = $$++; // 5
        if (__ < ++$$ || __-- > $$) // 5 < 7 || (não executa por causa do short-circuit)
            System.out.print("A");

        System.out.print($$); // 7
        System.out.print(__); // 4
    }
}