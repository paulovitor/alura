import java.util.function.Predicate;

class Person {
    private String name;
    private int age;
    //...
}

@FunctionalInterface 
interface Matcher<T>{
    boolean test(T t);
}

// class PersonFilter{

//     public List<Person> filter(List<Person> input, 
//                                Matcher<Person> matcher){
//         List<Person> output = new ArrayList<>();
//         for (Person person : input) {
//             if(matcher.test(person)){
//                 output.add(person);
//             }
//         }    
//         return output;
//     }
// }

class PersonFilter{

    public List<Person> filter(List<Person> input,
                               Predicate<Person> matcher){
        List<Person> output = new ArrayList<>();
        for (Person person : input) {
            if(matcher.test(person)){
                output.add(person);
            }
        }    
        return output;
    }
}

class AgeOfMajority implements Matcher<Person>{
    @Override
    public boolean test(Person p) {
        return p.getAge() >= 18;
    }
}

public class TestLambda {
    public static void main(String[] args) {
        PersonFilter pf = new PersonFilter();
        // List<Person> adults = pf.filter(persons, new AgeOfMajority());

        // List<Person> adults = pf.filter(persons, new Matcher<Person>() {
        //     @Override
        //     public boolean test(Person p) {
        //         return p.getAge() >= 18;
        //     }
        // });

        // Predicate<Person> matcher = new Predicate<Person>() {
        //     @Override
        //     public boolean test(Person p) {
        //         return p.getAge() >= 18;
        //     }
        // };

        // Predicate<Person> matcher = (Person p) -> {return p.getAge() >= 18;};
        // Predicate<Person> matcher = (p) -> {return p.getAge() >= 18;};
        // Predicate<Person> matcher = p -> {return p.getAge() >= 18;};
        // Predicate<Person> matcher = p -> p.getAge() >= 18;
        // List<Person> adults = pf.filter(persons, matcher);

        List<Person> adults = pf.filter(persons, p -> p.getAge() >= 18);

        List<Person> namesStartingWithA = pf.filter(persons, p -> p.getName().startsWith("A"));

        Runnable r = () -> System.out.println("a runnable object!");

        Predicate<Person> matcher = p -> p.getAge() >= 18;

        Runnable r = () ->  { 
            int a = 10;
            int b = 20;
            System.out.println(a + b);
        }
    }
}