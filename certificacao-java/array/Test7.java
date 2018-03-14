class A {
    public static void main(String[] args) {
        String[] valores = new String[2];
        valores[0] = "Certificação";
        valores[1] = "Java";
        Object[] vals = (Object[]) valores; // valores e vals apontam para o mesmo array na memória
        vals[1] = "Daniela"; // aponta para o mesmo elemento do valores[1]
        System.out.println(vals[1].equals(valores[1]));
    }
}