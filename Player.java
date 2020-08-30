package strategydesignpattern;

/**
 * Player abstract class, represents a hockey player. Subclasses are Defenceman, Forward, and Goalie
 * 
 * @author Nghia Nguyen
 *
 */
public abstract class Player {
  /**
   * Name of the player
   */
  protected String name;
  /**
   * Whether or not they are playing with offensive behavior
   */
  private boolean offense;
  /**
   * Stores the defensive behavior a player will use
   */
  protected DefenceBehavior defenceBehavior;
  /**
   * Stores the offensive behavior a player will use
   */
  protected OffenceBehavior offenceBehavior;

  /**
   * Creates a new player with a name. offense instance variable is automatically set to true. Calls
   * setOffenceBehavior and setDefenceBehavior to set their respective behaviors
   * 
   * @param name
   */
  public Player(String name) {
    this.name = name;
    offense = true;
    setOffenceBehavior();
    setDefenceBehavior();
  }

  /**
   * sets the offensive behavior of a player. To be completed in subclass
   */
  public abstract void setOffenceBehavior();

  /**
   * sets the defensive behavior of a player. To be completed in subclass
   */
  public abstract void setDefenceBehavior();

  /**
   * Gets the appropriate play method
   * 
   * @return a string with how the players are playing
   */
  public String play() {
    if (offense == true)
      return offenceBehavior.play();
    else
      return defenceBehavior.play();
  }

  /**
   * Switches player's offense instance variable
   */
  public void turnover() {
    offense = !(offense);
  }
}
