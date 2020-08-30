package strategydesignpattern;

import java.util.Random;

/**
 * 
 * @author Nghia Nguyen
 *
 */
public class BlockBehavior implements DefenceBehavior {
  /**
   * @return between 3 randomly chosen Strings that displays a block behavior
   */
  public String play() {
    Random r = new Random();
    int chance = r.nextInt(3);

    if (chance == 0)
      return "blocks player from passing";
    else if (chance == 1)
      return "blocks player from shooting";
    else
      return "checks player with puck";
  }
}
