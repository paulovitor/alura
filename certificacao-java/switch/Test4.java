class A {
    public static void main(String[] args) {
        int count = args.length;
        switch(count) {
            case 0 { // A sintaxe do case é com : e não com {
                System.out.println("nenhum");
                break;
            } case 1: { // Até podemos usar {, mas não sem os dois pontos
            } case 2 {
                System.out.println("ok");
            } default {
                System.out.println("default");
            }
        }
    }
}