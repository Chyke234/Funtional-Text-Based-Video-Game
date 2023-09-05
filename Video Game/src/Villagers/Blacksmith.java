package Villagers;

// Define the Blacksmith class, which extends the Villager class
public class Blacksmith extends Villager {
    private final String specialty; // The specialty of the blacksmith

    // Constructor to initialize a Blacksmith instance
    public Blacksmith(String firstName, String lastName, int age, String specialty) {
        super(firstName, lastName, age); // Call the constructor of the parent class (Villager)
        this.specialty = specialty; // Initialize the specialty of the blacksmith
    }

    // Getter method for the blacksmith's specialty
    public String getSpecialty() {
        return specialty;
    }

    // Method to print details of the blacksmith (overrides parent's printDetails method)
    @Override
    public void printDetails() {
        super.printDetails(); // Call the printDetails method of the parent class (Villager)
        System.out.println("Specialty: " + specialty);
    }

    // Method to calculate the weapon quality bonus provided by the blacksmith
    public int calculateWeaponQualityBonus() {
        // Calculate and return the weapon quality bonus provided by the blacksmith
        return 10;
    }
}
