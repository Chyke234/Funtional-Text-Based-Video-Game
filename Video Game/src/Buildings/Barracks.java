// Import the required class for Knights
package Buildings;

import Villagers.Knight;

import java.util.ArrayList;
import java.util.List;

// Define the Barracks class as a subclass of Building
public class Barracks extends Building {
    private static final String name = "Barracks"; // Provide a name for the Barracks
    private final List<Knight> knights = new ArrayList<>(); // List to store recruited knights

    // Constructor for Barracks
    public Barracks() {
        super(name); // Call the constructor of the parent class (Building) with the provided name
    }

    // Method to recruit a Knight and add them to the knights list
    public void recruitKnight(Knight knight) {
        knights.add(knight); // Add the recruited Knight to the list
        System.out.println(knight.getFirstName() + " recruited to " + getName() + " barracks.");
    }

    // Method to retrieve the list of recruited Knights
    public List<Knight> getKnights() {
        return knights; // Return the list of knights
    }

    // Override the getType method from the parent class to return "Barracks"
    @Override
    public String getType() {
        return "Barracks";
    }
}
