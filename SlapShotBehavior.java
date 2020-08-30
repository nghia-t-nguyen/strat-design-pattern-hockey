package strategydesignpattern;

/**
 * Has one method, play, that returns a string for slap shot behavior
 * 
 * @author Nghia Nguyen
 *
 */
public class SlapShotBehavior implements OffenceBehavior {
  /**
   * @return String for slap shot behavior
   */
  public String play() {
    return "shoots the puck from the blue line";
  }
}
