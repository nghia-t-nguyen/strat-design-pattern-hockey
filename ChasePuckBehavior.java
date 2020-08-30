package strategydesignpattern;

/**
 * Has one method, play, that returns a String for a chase puck behavior
 * 
 * @author Nghia Nguyen
 *
 */
public class ChasePuckBehavior implements DefenceBehavior {
  /**
   * @return String for chase puck behavior
   */
  public String play() {
    return "chases the puck";
  }
}
