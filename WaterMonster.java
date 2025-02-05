/** Project: Monster
 * Purpose Details: Create Monster
 * Course: IST 242
 * Author: Artiyom Dukhin
 * Date Developed: 02/04/2025
 * Last Date Changed: 02/04/2025
 * Rev:

 */
/**
 * Represents a Water-type monster.
 * Water monsters have unique abilities related to the water element.
 */
public class WaterMonster extends Monster {

    /**
     * Constructor for creating a WaterMonster.
     *
     * @param name   The name of the monster.
     * @param health The health points of the monster.
     */
    public WaterMonster(String name, int health) {
        super(name, health, MonsterType.WATER);
    }
    /**
     * does the special power of the WaterMonster.
     * This monster uses a Tsunami Wave attack.
     */
    public void specialPowers() {
        System.out.println(getName() + " uses Tsunami Wave!");
    }
}
