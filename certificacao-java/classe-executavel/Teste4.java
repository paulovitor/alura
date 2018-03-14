// para rodar sem o arquivo manifesto precisamos customizar o classpath
// java -cp programa.jar b.A

// adicionar o arquivo programa.jar ao classpath na compilação: javac -cp programa.jar:. b/A.java
package b;
class A {
    public static void main(String[] args) {
        System.out.println(args[0]);
    }
}