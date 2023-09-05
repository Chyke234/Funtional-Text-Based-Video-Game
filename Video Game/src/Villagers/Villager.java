package Villagers;

// Define the Villager class
public class Villager {
    // Instance variables
    private String firstName;
    private String lastName;
    private int age;

    // Constructor to initialize a Villager instance
    public Villager(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // Getter methods for the instance variables
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    // Setter methods for the instance variables
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Method to print details of the Villager
    public void printDetails() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Age: " + age);
    }

    // Method to print details of the Villager (using printDetails)
    public void print() {
        printDetails();
    }
}
