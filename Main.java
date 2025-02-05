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
        Monster m1 = new FireMonster("Inferno", 100);
        Monster m2 = new WaterMonster("Aqua", 120);
        Monster m3 = new EarthMonster("Terra", 140);
        Monster m4 = new FireMonster("Blaze", 110);
        Monster m5 = new WaterMonster("Hydro", 130);

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
        System.out.println(m1.getName() + " - Type: " + m1.getClass().getSimpleName() + ", Health Level: " + m1.getHealth());
        System.out.println(m2.getName() + " - Type: " + m2.getClass().getSimpleName() + ", Health Level: " + m2.getHealth());
        System.out.println(m3.getName() + " - Type: " + m3.getClass().getSimpleName() + ", Health Level: " + m3.getHealth());
        System.out.println(m4.getName() + " - Type: " + m4.getClass().getSimpleName() + ", Health Level: " + m4.getHealth());
        System.out.println(m5.getName() + " - Type: " + m5.getClass().getSimpleName() + ", Health Level: " + m5.getHealth());
    }
}
