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
    private String color;
    private int health;
    private int strength;
    private MonsterType type;

    /**
     * Constructor for creating a Monster.
     *
     * @param name     The name of the monster.
     * @param color    the color of the monster.
     * @param health   The health points of the monster.
     * @param strength Power of monster
     * @param type     The type of the monster (FIRE, WATER, EARTH).
     */
    public Monster(String name, String color, int health, int strength, MonsterType type) {
        this.name = name;
        this.color = color;
        this.health = health;
        this.strength = strength;
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
     *
     * @return the color of the monster.
     */
    public String getColor() {
        return color;
    }

    /**
     * @return The health points of the monster.
     */
    public int getHealth() {
        return health;
    }

    /**
     *
     * @return strength of monster
     */
    public int getStrength() {
        return strength;
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
     * sets the monsters color
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
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
     * Sets the monster's strength.
     *
     * @param strength The new strength value.
     */
    public void setStrength(int strength) {
        this.strength = strength;
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
        return "Name: " + name + ", Color: " + color + ", Health: " + health +", Strength: " + strength + ", Type: " + type;
    }
}
