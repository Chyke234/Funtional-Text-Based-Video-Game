package Villagers;

import java.util.Random;
import java.util.Scanner;

// Define the Knight class, which extends the Villager class
public class Knight extends Villager {
    public static final String specialty = "Knight"; // Specialty of the knight
    private Weapons weapon; // The weapon the knight has
    private int strength; // Strength of the knight

    // Constructor to initialize a Knight instance
    public Knight(String firstName, String lastName, int age) {
        super(firstName, lastName, age); // Call the constructor of the parent class (Villager)
        generateStrength(); // Generate a random strength value for the knight
        selectWeapon(); // Select a weapon for the knight
        System.out.println("\nKnight created\n");
        print(); // Print the knight's details
    }

    // Method to generate a random strength value for the knight
    private void generateStrength() {
        Random rand = new Random();
        strength = rand.nextInt(10) + 1; // Generate a random value between 1 and 10
    }

    // Method to allow the knight to select a weapon
    private void selectWeapon() {
        int i = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nSelect your weapon:");
        for (Weapons w : Weapons.values()) {
            System.out.println(i + ": " + w);
            i++;
        }
        System.out.print("Enter weapon name: ");
        String weaponName = scanner.nextLine();

        for (Weapons w : Weapons.values()) {
            if (weaponName.equalsIgnoreCase(w.toString())) {
                this.weapon = w;
                break;
            }
        }

        if (this.weapon == null) {
            System.out.println("Incorrect choice. Please select a weapon from the list (e.g., Sword)\n\n");
        }
    }

    // Getter method for the knight's weapon
    public Weapons getWeapon() {
        return weapon;
    }

    // Getter method for the knight's strength
    public int getStrength() {
        return strength;
    }

    // Method to simulate a battle between two knights
    public void fight(Knight enemyKnight) {
        Random rand = new Random();
        int playerStrength = this.getStrength();
        int enemyStrength = enemyKnight.getStrength();

        int playerRoll = rand.nextInt(playerStrength) + 1;
        int enemyRoll = rand.nextInt(enemyStrength) + 1;

        if (playerRoll > enemyRoll) {
            System.out.println(this.getFirstName() + " " + this.getLastName() + " wins the battle!");
        } else if (playerRoll < enemyRoll) {
            System.out.println(enemyKnight.getFirstName() + " " + enemyKnight.getLastName() + " wins the battle!");
        } else {
            System.out.println("It's a draw! Both knights fought bravely.");
        }
    }

    // Method to print the knight's details
    public void print() {
        System.out.println("Name: " + getFirstName() + " " + getLastName());
        System.out.println("Age: " + getAge());
        System.out.println("Strength: " + getStrength());
        System.out.println("Weapon: " + getWeapon());
    }

    // Main method for testing
    public static void main(String[] args) {
        Knight knight = new Knight("Lancelot", "Chike", 35);
    }

    // Method to calculate the defense bonus provided by the knight
    public int calculateDefenseBonus() {
        return 0; // Currently returns 0; you can implement actual defense bonus calculation here
    }

    // Method to calculate the attack bonus provided by the knight
    public int calculateAttackBonus() {
        // Calculate and return the attack bonus provided by the knight (e.g., strength * 2)
        return strength * 2;
    }
}
