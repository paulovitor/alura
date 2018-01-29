public class Person{
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Expose the full name of the person,
    // but not how it's stored internally
    public String getFullName(){
        return this.firstName + " "
            + this.lastName;
    }
}