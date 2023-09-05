package Villagers;

// Define the Farmer class, which extends the Villager class
public class Farmer extends Villager {
    private final int crops; // Number of crops the farmer has

    // Constructor to initialize a Farmer instance
    public Farmer(String firstName, String lastName, int age, int crops) {
        super(firstName, lastName, age); // Call the constructor of the parent class (Villager)
        this.crops = crops; // Initialize the number of crops
    }

    // Getter method for the number of crops the farmer has
    public int getCrops() {
        return crops;
    }

    // Method to print details of the farmer (overrides parent's printDetails method)
    @Override
    public void printDetails() {
        super.printDetails(); // Call the printDetails method of the parent class (Villager)
        System.out.println("Crops: " + crops);
    }

    // Method to calculate the resource bonus provided by the farmer
    public int calculateResourceBonus() {
        // Currently returns 0; you can implement actual resource bonus calculation here
        return 0;
    }
}
