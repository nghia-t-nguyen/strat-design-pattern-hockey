package strategydesignpattern;

/**
 * Has one method, play, that returns a String for a pass behavior
 * 
 * @author Nghia Nguyen
 *
 */
public class PassBehavior implements OffenceBehavior {
  /**
   * @return String for pass behavior
   */
  public String play() {
    return "passes to a forward";
  }
}
