// Import the required class for Villagers
package Buildings;

import Villagers.Villager;

import java.util.ArrayList;
import java.util.List;

// Define the Building class
public class Building {

    private List<Person> residents;

    public <Person> List<Person> getResidents() {
        return (List<Person>) residents;
    }
    private String name; // Field to store the name of the building
    private final List<Villager> assignedVillagers = new ArrayList<>(); // List to store assigned villagers

    // Constructor for Building, takes the name as a parameter
    public Building(String name) {
        this.name = name; // Set the name field using the constructor parameter
    }

    // Method to get the name of the building
    public String getName() {
        return name;
    }

    // Method to print the details of the building
    public void printDetails() {
        System.out.println("Building Name: " + name);
    }

    // Method to get the type of the building, returns a string indicating the building type
    public String getType() {
        return "Building";
    }

    // Method to assign a Villager to the building
    public void assignVillager(Villager villager) {
        assignedVillagers.add(villager); // Add the assigned Villager to the list
    }

    // Method to retrieve the list of assigned Villagers
    public List<Villager> getAssignedVillagers() {
        return assignedVillagers; // Return the list of assigned Villagers
    }
}
