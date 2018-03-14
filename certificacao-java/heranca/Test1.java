class A {
    public void metodo(long l) {
    }
}
class B extends A{
    protected void metodo(int i) { // não é sobrescrita ( os parâmetros são diferentes, ocorre uma sobrecarga)
    }
}