public class Pokemon {
    final String name;
    final String type;
    double health;
    final double maxHealth;
    double attack;
    boolean conscious = true;

    public Pokemon(String name, String type, double health, double maxHealth, double attack, boolean conscious) {
        this.name = name;
        this.type = type;
        this.health = health;
        this.maxHealth = maxHealth;
        this.attack = attack;
        this.conscious = conscious;
    }

    public static int knockouts = 0;

    public void takeDamage(Pokemon other) {
        if (this.name != other.name) {
            other.health -= (double) this.attack;
            System.out.println(other.name + " was attacked by " + this.name + " and took " + this.attack + " damage!");
        }
        if (this.name == other.name) {
            other.health -= (double) this.attack * 0.5;
        }

        if (other.health <= 0) {
            other.conscious = false;
            other.health = 0;
            System.out.println(other.name + " was knocked out!");
            knockouts++;

        }
        System.out.println(other.name + " now has " + other.health + " health.");

    }

    public void takeHeal(Pokemon other) {
        other.health += this.maxHealth * 0.25;
        if (other.health >= other.maxHealth) {
            other.health = other.maxHealth;
        }
        if (other.health > 0) {
            other.conscious = true;
        }
        System.out.println(this.name + " is old friends with " + other.name + " and healed them!");
        System.out.println(other.name + " now has " + other.health + " health.");
    }

    public void interact(Pokemon other) {
        if (this.type.equals(other.type)) {
            if (other.conscious == false) {
                this.takeHeal(other);
            } else {
                System.out.println(this.name + " and " + other.name + " are old friends and have lunch.");
            }
        } else {
            if (other.conscious == true) {
                takeDamage(other);
                other.attack *= 0.5;
                takeDamage(this);
                other.attack *= 2;
            } else {
                System.out.println(other.name + " is found unconscious by " + this.name + " and is left alone.");
            }

        }
    }

    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon("Pikachu", "Electric", 35.0, 35.0, 28.0, true);
        Pokemon charizard = new Pokemon("Charizard", "Fire", 78.0, 78.0, 42.0, true);
        Pokemon squirtle = new Pokemon("Squirtle", "Water", 44.0, 44.0, 25.0, true);
        Pokemon charmander = new Pokemon("Charmander", "Fire", 38.0, 38.0, 26.0, true);
        charmander.interact(pikachu);
        squirtle.interact(charmander);
        charizard.interact(squirtle);
        pikachu.interact(squirtle);
        charizard.interact(charmander);
        charmander.interact(charizard);
        pikachu.interact(charmander);
        System.out.println("There were: " + knockouts + " knockouts.");

    }
}
