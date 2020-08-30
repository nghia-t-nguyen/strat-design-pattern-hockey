package strategydesignpattern;

/**
 * Has one method, play, that returns a string for a shoot behavior
 * 
 * @author Nghia Nguyen
 *
 */
public class ShootBehavior implements OffenceBehavior {
  /**
   * @return String for shoot behavior
   */
  public String play() {
    return "shoots at the goal";
  }
}
