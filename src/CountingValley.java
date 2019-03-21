public class CountingValley {

  public static void main(final String[] args) {
    final CountingValley cv = new CountingValley();
  }

  /**
   * <a href="https://www.hackerrank.com/challenges/counting-valleys/problem">link</a>
   *
   * @param steps Number of steps
   * @param moves [D,U] Down, Up
   *
   * @return Num of valleys, a valley is a below-sea-level place. Starting at sea level.
   */
  private int count(final int steps, final String moves) {
    int v = 0;     // # of valleys
    int lvl = 0;   // current level
    for (final char c : moves.toCharArray()) {
      if (c == 'U') {
        lvl++;
      }
      if (c == 'D') {
        lvl--;
      }

      // if we just came UP to sea level
      if (lvl == 0 && c == 'U') {
        v++;
      }
    }
    return v;
  }
}
