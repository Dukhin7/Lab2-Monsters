/** Project: Monster
 * Purpose Details: Create Monster
 * Course: IST 242
 * Author: Artiyom Dukhin
 * Date Developed: 02/04/2025
 * Last Date Changed: 02/04/2025
 * Rev:

 */
/**
 * The main class to demonstrate the Monsters ranking.
 * It creates instances of different monster types and calls their methods.
 */
public class Main {
    public static void main(String[] args) {
        /**
         * Creating different types of monsters
         */
        Monster m1 = new FireMonster("Inferno", "Red" ,100, 20);
        Monster m2 = new WaterMonster("Aqua", "Blue" ,120, 55);
        Monster m3 = new EarthMonster("Terra", "Green" ,140, 90);
        Monster m4 = new FireMonster("Blaze", "Light Red" ,110, 65);
        Monster m5 = new WaterMonster("Hydro", "Baby Blue" ,130, 70);

        /**
         * Calling the special powers of each monster
         */
        m1.specialPowers();
        m2.specialPowers();
        m3.specialPowers();
        m4.specialPowers();
        m5.specialPowers();

        /**
         * print details of each monster
         */
        System.out.println("\nMonster Details:");
        System.out.println(m1.getName() + " - Type: " + m1.getClass().getSimpleName() +
                ", Color: " + m1.getColor() +
                ", Health Level: " + m1.getHealth() +
                ", Strength: " + m1.getStrength());

        System.out.println(m2.getName() + " - Type: " + m2.getClass().getSimpleName() +
                ", Color: " + m2.getColor() +
                ", Health Level: " + m2.getHealth() +
                ", Strength: " + m2.getStrength());

        System.out.println(m3.getName() + " - Type: " + m3.getClass().getSimpleName() +
                ", Color: " + m3.getColor() +
                ", Health Level: " + m3.getHealth() +
                ", Strength: " + m3.getStrength());

        System.out.println(m4.getName() + " - Type: " + m4.getClass().getSimpleName() +
                ", Color: " + m4.getColor() +
                ", Health Level: " + m4.getHealth() +
                ", Strength: " + m4.getStrength());

        System.out.println(m5.getName() + " - Type: " + m5.getClass().getSimpleName() +
                ", Color: " + m5.getColor() +
                ", Health Level: " + m5.getHealth() +
                ", Strength: " + m5.getStrength());
    }
}
