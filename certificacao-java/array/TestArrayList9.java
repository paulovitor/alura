import java.util.ArrayList;
class A {
    public static void main(String[] args) {
        ArrayList<String> ss = new ArrayList<String>();
        ss.add("a");
        ss.add("b");
        ss.add("c");
        ss.add("d");

        for(String s:ss){
            // o laço está alterando o valor referenciado pela variável s, 
            // e não o valor contido dentro da nossa ArrayList
            if(s.equals("c")) s = "b";
            else if(s.equals("b")) s= "c";
        }
        for(String s:ss) System.out.println(s); // a, b, c, d
    }
}