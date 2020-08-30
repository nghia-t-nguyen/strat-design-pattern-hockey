package strategydesignpattern;

import java.util.Random;

/**
 * Has one method, play, that returns a String for a block goal behavior
 * 
 * @author Nghia Nguyen
 *
 */
public class BlockGoalBehavior implements DefenceBehavior, OffenceBehavior {
  /**
   * @return between 4 randomly chosen Strings that displays a block goal behavior
   */
  public String play() {
    Random r = new Random();
    int chance = r.nextInt(4);

    if (chance == 0)
      return "hand blocks the puck";
    else if (chance == 1)
      return "catches the puck";
    else if (chance == 2)
      return "blocks puck with knee pads";
    else
      return "blocks puck with stick";
  }
}
