import java.util.HashSet;
import java.util.Set;

public class SockMerchant {

  public static void main(String[] args) {
    SockMerchant s = new SockMerchant();
    int[] arr = {10, 20, 20, 10, 10, 30, 50, 10, 20};
    int res = s.sock(9, arr);
    System.out.println(res);
  }

  /**
   * <a href="https://www.hackerrank.com/challenges/sock-merchant/problem">linl</a>
   * @param n Number of sockets.
   * @param colours The colours.
   * @return Number of pairs.
   */
  private int sock(int n, int[] colours) {
    Set<Integer> s = new HashSet<>(n);
    int c = 0;
    for (int i: colours) {
      if (!s.add(i)) {
        s.remove(i);
        c++;
      } else {
        s.add(i);
      }

    }
    return c;
  }
}
