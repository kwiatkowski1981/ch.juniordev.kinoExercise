public class Guest {

    String firstName;
    String lastName;
    int age;

    public Guest(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public String personData(Guest guest){

        return "Firstname: " + firstName + " Lastname " + lastName;

    }
}
