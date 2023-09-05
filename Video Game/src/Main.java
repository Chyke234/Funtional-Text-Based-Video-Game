import Buildings.*;
import Territory.Territory;
import Villagers.Blacksmith;
import Villagers.Farmer;
import Villagers.Knight;
import Villagers.Villager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Village Simulation!");

        System.out.print("Enter the name of your territory: ");
        String territoryName = scanner.nextLine();

        Territory territory = new Territory("My Territory");

        // Create a Knight instance
        Knight knight = new Knight("Lancelot", "Chike", 35);
        territory.addVillager(knight); // Add the Knight to the list of villagers

        // Create a Forge instance
        Forge forge = new Forge(territoryName + " Forge");
        territory.addBuilding(forge); // Add the Forge building to the territory



        boolean running = true;
        while (running) {
            System.out.println("\n1. Add Villager");
            System.out.println("2. Add Building");
            System.out.println("3. Assign Villager to Building");
            System.out.println("4. Print Territory Structure");
            System.out.println("5. Initiate a battle between two knights");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline


            switch (choice) {
                case 1:
                    System.out.print("Enter villager's first name: ");
                    String firstName = scanner.nextLine();
                    System.out.print("Enter villager's last name: ");
                    String lastName = scanner.nextLine();
                    System.out.print("Enter villager's age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    System.out.print("Enter villager type (Knight, Farmer, Blacksmith): ");
                    String villagerType = scanner.nextLine();

                    Villager newVillager;

                    switch (villagerType) {
                        case "Knight":
                            newVillager = new Knight(firstName, lastName, age);
                            break;
                        case "Farmer":
                            System.out.print("Enter farmer's crops: ");
                            int crops = scanner.nextInt();
                            scanner.nextLine(); // Consume newline
                            newVillager = new Farmer(firstName, lastName, age, crops);
                            break;
                        case "Blacksmith":
                            System.out.print("Enter blacksmith's specialty: ");
                            String specialty = scanner.nextLine();
                            newVillager = new Blacksmith(firstName, lastName, age, specialty); // Corrected here
                            break;
                        default:
                            System.out.println("Invalid villager type.");
                            continue; // Continue to the next iteration of the loop
                    }

                    territory.addVillager(newVillager); // Corrected here
                    break;

                case 2:
                    System.out.print("Enter building type (Barracks, Forge, House): ");
                    String buildingType = scanner.nextLine();

                    Building newBuilding;

                    switch (buildingType) {
                        case "Barracks":
                            newBuilding = new Barracks();
                            break;
                        case "Forge":
                            newBuilding = new Forge(territoryName + " Forge"); // Provided code
                            break;
                        case "House":
                            newBuilding = new House();
                            break;
                        default:
                            System.out.println("Invalid building type.");
                            continue; // Continue to the next iteration of the loop
                    }

                    territory.addBuilding(newBuilding);
                    break;
                case 3:
                    System.out.println("Select a villager:");
                    territory.printVillagers();
                    int villagerIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    System.out.println("Select a building:");
                    territory.printBuildings();
                    int buildingIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    territory.assignVillagerToBuilding(villagerIndex, buildingIndex);
                    break;
                case 4:
                    territory.printTerritoryStructure();
                    break;
                case 5: // Added this case for initiating a battle between knights
                    System.out.println("Select the index of the first knight:");
                    territory.printVillagers();
                    int knightIndex1 = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    System.out.println("Select the index of the second knight:");
                    territory.printVillagers();
                    int knightIndex2 = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    Knight knight1 = (Knight) territory.getVillagerByIndex(knightIndex1);
                    Knight knight2 = (Knight) territory.getVillagerByIndex(knightIndex2);

                    // Initiate a battle
                    if (knight1 != null && knight2 != null) {
                        initiateBattle(knight1, knight2);
                    } else {
                        System.out.println("Invalid knight index.");
                    }
                    break;
                case 6:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }


            territory = new Territory("My Territory");

            int knightIndex = 0;
            knight = territory.getKnightByIndex(knightIndex);

            if (knight != null) {
                System.out.println("Knight name: " + knight.getFirstName() + " " + knight.getLastName());
                // Use the knight instance for your intended purpose
            } else {
                System.out.println("No knight found at index " + knightIndex);
            }

            // Create a Person instance
            Person person = new Person("John", "Doe", 30);
            System.out.println("Person: " + person.getFirstName() + " " + person.getLastName() + " Age: " + person.getAge());


            // Display bonus information
            int totalDefenseBonus = territory.getTotalDefenseBonus();
            System.out.println("Total defense bonus: " + totalDefenseBonus);

            int totalResourceBonus = territory.getTotalResourceBonus();
            System.out.println("Total resource bonus: " + totalResourceBonus);

            int totalWeaponQualityBonus = territory.getTotalWeaponQualityBonus();
            System.out.println("Total weapon quality bonus: " + totalWeaponQualityBonus);

            System.out.println("Goodbye!");
        }
    }

    // New method for initiating a battle between knights
    private static void initiateBattle(Knight knight1, Knight knight2) {
        int strength1 = knight1.getStrength();
        int strength2 = knight2.getStrength();

        if (strength1 > strength2) {
            System.out.println(knight1.getFirstName() + " " + knight1.getLastName() + " wins the battle!");
        } else if (strength2 > strength1) {
            System.out.println(knight2.getFirstName() + " " + knight2.getLastName() + " wins the battle!");
        } else {
            System.out.println("It's a tie! Both knights have equal strength.");
        }
    }
}
