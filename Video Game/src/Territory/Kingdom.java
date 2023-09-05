package Territory;

import java.util.ArrayList;
import java.util.List;

public class Kingdom<Castle> extends Territory {
    private final List<Castle> castles;
    private int treasuryGold;

    // Constructor for the Kingdom class
    public Kingdom(String name) {
        super(name);
        castles = new ArrayList<>();
        treasuryGold = 1000; // Initial treasury gold
    }

    // Method to add a castle to the kingdom
    public void buildCastle(Castle castle) {
        castles.add(castle);
        System.out.println("A new castle is built in the " + super.getName() + " kingdom.");
    }

    // Method to get the list of castles in the kingdom
    public List<Castle> getCastles() {
        return castles;
    }

    // Method to get the current treasury gold
    public int getTreasuryGold() {
        return treasuryGold;
    }

    // Method to collect taxes and add gold to the treasury
    public void collectTaxes(int amount) {
        treasuryGold += amount;
        System.out.println(super.getName() + " kingdom collects " + amount + " gold in taxes.");
    }

    // Method to spend gold from the treasury
    public boolean spendGold(int amount) {
        if (treasuryGold >= amount) {
            treasuryGold -= amount;
            return true;
        }
        return false;
    }

    // Add additional methods or properties here if needed
}
