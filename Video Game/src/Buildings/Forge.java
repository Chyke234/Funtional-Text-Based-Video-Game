// Import the required class for Blacksmith
package Buildings;

import Villagers.Blacksmith;

import java.util.ArrayList;
import java.util.List;

// Define the Forge class, extending the Building class
public class Forge extends Building {
    private final List<Blacksmith> blacksmiths = new ArrayList<>(); // List to store hired blacksmiths

    // Constructor for Forge, takes the name as a parameter and calls the superclass constructor
    public Forge(String name) {
        super(name);
    }

    // Method to hire a Blacksmith and add them to the list
    public void hireBlacksmith(Blacksmith blacksmith) {
        blacksmiths.add(blacksmith); // Add the hired Blacksmith to the list
        System.out.println(blacksmith.getFirstName() + " hired to " + getName() + " forge.");
    }

    // Method to retrieve the list of hired Blacksmiths
    public List<Blacksmith> getBlacksmiths() {
        return blacksmiths; // Return the list of hired Blacksmiths
    }

    // Override the getType() method to return the type of the building
    @Override
    public String getType() {
        return "Forge";
    }
}
