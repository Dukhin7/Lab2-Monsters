/** Project: Monster
 * Purpose Details: Create Monster
 * Course: IST 242
 * Author: Artiyom Dukhin
 * Date Developed: 02/04/2025
 * Last Date Changed: 02/04/2025
 * Rev:

 */

/**
 * Represents an Earth-type monster.
 * Earth monsters have unique abilities related to the earth element.
 */
public class EarthMonster extends Monster {
    /**
     * Constructor for creating an EarthMonster.
     *
     * @param name   The name of the monster.
     * @param health The health points of the monster.
     */
    public EarthMonster(String name, int health) {
        super(name, health, MonsterType.EARTH);
    }
    /**
     * does the special power of the EarthMonster.
     * This monster uses an Earthquake attack.
     */
    public void specialPowers() {
        System.out.println(getName() + " uses Earthquake!");
    }
}
