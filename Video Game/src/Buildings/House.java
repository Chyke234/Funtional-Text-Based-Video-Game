// Import the required class for Villager
package Buildings;

import Villagers.Villager;

import java.util.ArrayList;
import java.util.List;

// Define the House class, extending the Building class
public class House extends Building {
    private static final String name = "House"; // Set the name of the house
    private final List<Villager> residents = new ArrayList<>(); // List to store residents of the house

    // Constructor for House, calls the superclass constructor with the predefined name
    public House() {
        super(name);
    }

    // Method to add a resident to the house
    public void addResident(Villager resident) {
        residents.add(resident); // Add the resident to the list
        System.out.println(resident.getFirstName() + " added to " + getName() + " house.");
    }

    // Method to retrieve the list of residents
    public List<Villager> getResidents() {
        return residents; // Return the list of residents
    }

    // Override the getType() method to return the type of the building
    @Override
    public String getType() {
        return "House";
    }
}
