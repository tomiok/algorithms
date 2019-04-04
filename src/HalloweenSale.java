public class HalloweenSale {

  public static void main(String[] args) {
    HalloweenSale hs = new HalloweenSale();
    int res = hs.howManyGames(20, 3, 6, 80);
    System.out.println(res);
  }

  /**
   * <a href="https://www.hackerrank.com/challenges/halloween-sale/problem>link</a>
   */
  private int howManyGames(int p, int d, int m, int s) {
    int count = 0;

    while (s >= 0) {
      s -= p;
      count++;
      if (p - d >= m) {
        p -= d;
      } else {
        p = m;
      }

    }

    return count - 1;
  }
}
