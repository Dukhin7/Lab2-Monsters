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
     * @param health The health points of the monster.
     */

    public FireMonster(String name, int health) {
        super(name, health, MonsterType.FIRE);
    }
    /**
     * uses the special power of the FireMonster.
     * This monster does a Fire Blast attack.
     */
    public void specialPowers() {
        System.out.println(getName() + " uses Fire Blast!");
    }
}

