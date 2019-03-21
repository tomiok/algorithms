public class SaveThePrisoner {

  public static void main(String[] args) {
    int v = saveThePrisoner(5, 7, 3);
    System.out.println(v);
  }

  /**
   * <a href="https://www.hackerrank.com/challenges/save-the-prisoner/problem">link</a>
   *
   * @param prisoners Num of prisoners.
   * @param sweets    Num of sweets to share, the last one is the poisoned.
   * @param startAt   The position to start giving the sweets, the prisoners are sitting like an array
   *                  (1-based)
   *
   * @return The poisoned prisoner, the one who received the last candy.
   */
  private static int saveThePrisoner(int prisoners,
                                     int sweets,
                                     int startAt) {

      /*
      it does not matter how many laps the sweets does. The modulo is the last position
      the candy reach in the prisoner "circle".
      i.e:
      5 prisoners
      7 candies
      start at position 3
      ---
      3 + 7 = 10
      10 - 1 (to fix 1 based position for prisoners) = 9
      9 % 5 = 4

      4 is the poisoned prisoner, the one who received the last candy.
       */
    int poisoned = (startAt + sweets - 1) % prisoners;

    if (poisoned == 0) {
      poisoned = prisoners;
    }

    return poisoned;
  }
}
