// Import necessary classes
package Territory;

import Buildings.Building;
import Villagers.Villager;
import Villagers.Knight;
import Villagers.Farmer;
import Villagers.Blacksmith;

import java.util.ArrayList;
import java.util.List;





// Define the Territory class to manage villages and their interactions
public class Territory {

    private String name;
    private final List<Villager> villagers = new ArrayList<>(); // List to store villagers
    private final List<Building> buildings = new ArrayList<>(); // List to store buildings
    private int totalDefenseBonus;
    private int totalResourceBonus;
    private int totalWeaponQualityBonus;

    // Constructor to initialize the Territory with a name
    public Territory(String territoryName) {
        this.name = territoryName;
    }

    // Method to add a new villager to the territory
    public void addVillager(String firstName, String lastName, int age) {
        Villager newVillager = new Villager(firstName, lastName, age);
        villagers.add(newVillager);
        System.out.println("Villager added to " + name + ".");
    }

    // Method to add a building to the territory
    public void addBuilding(Building building) {
        buildings.add(building);
        System.out.println(building.getType() + " added to " + name + ".");
    }

    // Method to assign a villager to a building
    public void assignVillagerToBuilding(int villagerIndex, int buildingIndex) {
        if (villagerIndex >= 0 && villagerIndex < villagers.size() && buildingIndex >= 0 && buildingIndex < buildings.size()) {
            Villager villager = villagers.get(villagerIndex);
            Building building = buildings.get(buildingIndex);
            building.assignVillager(villager);
            System.out.println(villager.getFirstName() + " " + villager.getLastName() + " assigned to " + building.getType() + ".");
        } else {
            System.out.println("Invalid villager or building index.");
        }
    }

    // Method to retrieve a Knight by index
    public Knight getKnightByIndex(int knightIndex) {
        if (knightIndex >= 0 && knightIndex < villagers.size()) {
            Villager villager = villagers.get(knightIndex);
            if (villager instanceof Knight) {
                return (Knight) villager; // Return the Villager as a Knight
            } else {
                System.out.println("The specified villager is not a Knight.");
            }
        } else {
            System.out.println("Invalid knight index.");
        }
        return null;
    }

    // Method to print the structure of the territory
    public void printTerritoryStructure() {
        System.out.println("Territory: " + name);
        System.out.println("Buildings and Villagers:");

        for (Building building : buildings) {
            System.out.println(building.getType() + ":");
            List<Villager> assignedVillagers = building.getAssignedVillagers();
            for (Villager villager : assignedVillagers) {
                System.out.println("- " + villager.getFirstName() + " " + villager.getLastName());
            }
        }
        // Print the treasury gold amount
        System.out.println("Treasury Gold: " + getTreasuryGold());
    }

    private String getTreasuryGold() {
        return null;
    }

    // Method to print villagers in the territory
    public void printVillagers() {
        System.out.println("Villagers in " + name + ":");
        for (int i = 0; i < villagers.size(); i++) {
            System.out.println((i + 1) + ". " + villagers.get(i).getFirstName() + " " + villagers.get(i).getLastName());
        }
    }

    // Method to print buildings in the territory
    public void printBuildings() {
        System.out.println("Buildings in " + name + ":");
        for (int i = 0; i < buildings.size(); i++) {
            System.out.println((i + 1) + ". " + buildings.get(i).getType());
        }
    }

    // Method to calculate and apply enhancements from villagers
    protected void applyEnhancements() {
        totalDefenseBonus = 0;
        totalResourceBonus = 0;
        totalWeaponQualityBonus = 0;

        for (Villager villager : villagers) {
            if (villager instanceof Knight) {
                totalDefenseBonus += ((Knight) villager).calculateDefenseBonus();
            } else if (villager instanceof Farmer) {
                totalResourceBonus += ((Farmer) villager).calculateResourceBonus();
            } else if (villager instanceof Blacksmith) {
                totalWeaponQualityBonus += ((Blacksmith) villager).calculateWeaponQualityBonus();
            }
        }
    }


    // Method to get the total defense bonus
    public int getTotalDefenseBonus() {
        return totalDefenseBonus;
    }

    // Method to get the total resource bonus
    public int getTotalResourceBonus() {
        return totalResourceBonus;
    }

    // Method to get the total weapon quality bonus
    public int getTotalWeaponQualityBonus() {
        return totalWeaponQualityBonus;
    }

    // Method to add a villager to the territory
    public void addVillager(Villager villager) {
        villagers.add(villager);
        System.out.println("Villager " + villager.getFirstName() + " " + villager.getLastName() + " added to " + name + ".");
    }

    // Method to get a villager by index
    public Villager getVillagerByIndex(int index) {
        if (index >= 0 && index < villagers.size()) {
            return villagers.get(index);
        } else {
            System.out.println("Invalid villager index.");
            return null;
        }
    }

    public static void main(String[] args) {
        // Example usage
        Territory territory = new Territory("My Territory");
        int knightIndex = 0;
        Knight knight = (Knight) territory.getVillagerByIndex(knightIndex);

        if (knight != null) {
            System.out.println("Knight name: " + knight.getFirstName() + " " + knight.getLastName());
            // Use the knight instance for your intended purpose
        } else {
            System.out.println("No knight found at index " + knightIndex);
        }
    }

    protected String getName() {
        return null;
    }
}
