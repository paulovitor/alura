class B{
    void x(int... x) {
        System.out.println(x.length);
    }
}
class A3 {
    public static void main(String[] args) {
    	// podemos invocar um método com varargs passando um array
        new B().x(new int[]{23789,673482});
    }
}