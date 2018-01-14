class Test{
    public static void main(String[] args){
    System.out.print("a");
    System.out.println('b'); // A
    System.out.print();      // B // erro de compilação! O método print não possui versão sem argumentos
    System.out.println("c"); 
    }
}