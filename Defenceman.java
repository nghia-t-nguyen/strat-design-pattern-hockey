package strategydesignpattern;

import java.util.Random;

/**
 * Represents a Defenceman hockey player
 * 
 * @author Nghia Nguyen
 *
 */
public class Defenceman extends Player {
  /**
   * Creates a defenceman, passes name paramater to Player class's constructor
   * 
   * @param name
   */
  public Defenceman(String name) {
    super(name);
  }

  /**
   * @return String with name and that they play the defenceman position
   * @override java.lang.Object.toString method
   */
  public String toString() {
    return this.name + " plays the position: Defenceman";
  }

  /**
   * Randomly sets offenceBehavior to either slapShotBehavior or PassBehavior. Will set it to
   * PassBehavior 9/10 times
   */
  public void setOffenceBehavior() {
    Random r = new Random();
    int chance = r.nextInt(10);

    if (chance == 0)
      this.offenceBehavior = new SlapShotBehavior();
    else
      this.offenceBehavior = new PassBehavior();
  }

  /**
   * Randomly sets DefenceBehavior to either ChasePuckBehavior or BlockBehavior
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
