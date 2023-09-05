package Territory;

import Villagers.Knight;
import java.util.ArrayList;
import java.util.List;

public class Dynasty extends Territory {
    private final List<Knight> royalKnights;

    // Constructor for the Dynasty class
    public Dynasty(String name) {
        super(name);
        royalKnights = new ArrayList<>();
    }

    // Method to add a royal knight to the dynasty
    public void addRoyalKnight(Knight knight) {
        royalKnights.add(knight);
        System.out.println(knight.getFirstName() + " " + knight.getLastName() + " joins the royal knights of " + getName() + " dynasty.");
    }

    // Method to get the name of the dynasty (override the method in the Territory class)
    @Override
    public String getName() {
        return (String) super.getName(); // Call the superclass method to get the name
    }

    // Method to get the list of royal knights
    public List<Knight> getRoyalKnights() {
        return royalKnights;
    }

    // Add additional methods or properties here if needed
}
