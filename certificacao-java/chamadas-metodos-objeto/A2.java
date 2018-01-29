class B{
    void x(int... x) {
    	// varargs é um array
        System.out.println(x.length);
    }
}
class A2 {
    public static void main(String[] args) {
        new B().x(23789,673482);
    }
}