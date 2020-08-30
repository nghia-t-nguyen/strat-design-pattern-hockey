package strategydesignpattern;

/**
 * Interface with one method that play for an appropriate offensive behavior
 * 
 * @author Nghia Nguyen
 *
 */
public interface OffenceBehavior {
  /**
   * @return String that appropriate defensive behavior
   */
  public String play();
}
