class A {
    public static void main(String[] args) {
        int zyx[][]=new int[3][10];
        int[]x=new int[20];
        int[]y=new int[10];
        int[]z=new int[30];
        zyx[0]=x; // não há problema em apontar para outro array
        zyx[1]=y;
        zyx[2]=z;
        System.out.println(zyx[2].length);
    }
}