package strategydesignpattern;

/**
 * Represents a goalie hockey player
 * 
 * @author Nghia Nguyen
 *
 */
public class Goalie extends Player {
  /**
   * Creates a goalie, passes name to PLayer class's constructor
   * 
   * @param name
   */
  public Goalie(String name) {
    super(name);
  }

  /**
   * @return a String with name that also says the player is a goalie
   * @override java.lang.Object.toString method
   */
  public String toString() {
    return this.name + " plays the position: Goalie";
  }

  /**
   * sets OffenceBehavior to BlockGoalBehavior
   */
  public void setOffenceBehavior() {
    this.offenceBehavior = new BlockGoalBehavior();
  }

  /**
   * sets DefenceBehavior to BlockGoalBehavior
   */
  public void setDefenceBehavior() {
    this.defenceBehavior = new BlockGoalBehavior();
  }
}
