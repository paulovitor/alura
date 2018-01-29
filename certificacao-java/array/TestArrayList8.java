import java.util.*;
class A {
  public static void main(String[] args) {
    ArrayList<String> a = new ArrayList<String>();
    a.add(0,"a");
    a.add(1,"b");
    for(Iterator<String> i=a.iterator();i.hasNext();i.next()) { // acaba iteração 0, chama novamente o next, logo array só tem 2 elementos
        String element = i.next(); // iteração 0 pega o elemento "a"
        System.out.println(element); // a
    }    
}
}