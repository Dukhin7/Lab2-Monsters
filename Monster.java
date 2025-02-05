/** Project: Monster
 * Purpose Details: Create Monster
 * Course: IST 242
 * Author: Artiyom Dukhin
 * Date Developed: 02/04/2025
 * Last Date Changed: 02/04/2025
 * Rev:

 */
/**
 * An abstract class representing a generic Monster.
 * All monsters have a name, health points, and a specific type.
 */
public abstract class Monster {
    private String name;
    private int health;
    private MonsterType type;

    /**
     * Constructor for creating a Monster.
     *
     * @param name   The name of the monster.
     * @param health The health points of the monster.
     * @param type   The type of the monster (FIRE, WATER, EARTH).
     */
    public Monster(String name, int health, MonsterType type) {
        this.name = name;
        this.health = health;
        this.type = type;
    }

    // Getter methods

    /**
     * @return The name of the monster.
     */
    public String getName() {
        return name;
    }

    /**
     * @return The health points of the monster.
     */
    public int getHealth() {
        return health;
    }

    /**
     * @return The type of the monster.
     */
    public MonsterType getType() {
        return type;
    }

    // Setter methods

    /**
     * Sets the monster's name.
     *
     * @param name The new name of the monster.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the monster's health points.
     *
     * @param health The new health value.
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * Sets the monster's type.
     *
     * @param type The new monster type.
     */
    public void setType(MonsterType type) {
        this.type = type;
    }

    /**
     * Abstract method for executing the monster's special power.
     */
    public abstract void specialPowers();

    /**
     * @return A string representation of the monster.
     */
    public String toString() {
        return "Name: " + name + ", Health: " + health + ", Type: " + type;
    }
}
