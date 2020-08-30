package strategydesignpattern;

import java.util.Random;

/**
 * Represents a forward hockey player
 * 
 * @author Nghia Nguyen
 *
 */
public class Forward extends Player {
  /**
   * Creates a forward, passes name to Player class's constructor
   * 
   * @param name
   */
  public Forward(String name) {
    super(name);
  }

  /**
   * @return String with name and says that the player is a forward
   * @override java.lang.Object.toString() method
   */
  public String toString() {
    return this.name + " plays the position: Forward";
  }

  /**
   * Randomly sets offenceBehavior to either a PassBehavior or ShootBehavior
   */
  public void setOffenceBehavior() {
    Random r = new Random();
    int chance = r.nextInt(2);

    if (chance == 0)
      this.offenceBehavior = new PassBehavior();
    else
      this.offenceBehavior = new ShootBehavior();
  }

  /**
   * Randomly sets defenceBehavior to either ChasePuckBehavior or BlockBehavior
   */
  public void setDefenceBehavior() {
    Random r = new Random();
    int chance = r.nextInt(2);

    if (chance == 0)
      this.defenceBehavior = new ChasePuckBehavior();
    else
      this.defenceBehavior = new BlockBehavior();
  }
}
