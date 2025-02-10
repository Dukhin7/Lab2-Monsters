/** Project: Monster
 * Purpose Details: Create Monster
 * Course: IST 242
 * Author: Artiyom Dukhin
 * Date Developed: 02/04/2025
 * Last Date Changed: 02/04/2025
 * Rev:

 */
/**
 * Represents a Fire-type monster.
 * Fire monsters have unique abilities related to the fire element.
 */
public class FireMonster extends Monster {
    /**
     * Constructor for creating a FireMonster.
     *
     * @param name   The name of the monster.
     * @param color the color of monster.
     * @param health The health points of the monster.
     * @param strength the strength point of the monster
     */

    public FireMonster(String name, String color, int health, int strength) {
        super(name, color, health, strength, MonsterType.FIRE);
    }
    /**
     * uses the special power of the FireMonster.
     * This monster does a Fire Blast attack.
     */
    public void specialPowers() {
        System.out.println(getName() + " uses Fire Blast!");
    }
}

