class A {
    public static void main(String[] args) {
        int x = 15;
        int y = x;
        // pois a atribuição é por cópia do valor
        y++;
        x++;
        int z = y;
        z--;
        System.out.println(x + y + z);
    }
}