import java.util.HashMap;
import java.util.Map;

public class MinimunDistance {

  public static void main(String[] args) {
    MinimunDistance minimunDistance = new MinimunDistance();
    int[] arr = { 7, 1, 3, 4, 1, 7 };
    int res = minimunDistance.minimumDistances(arr);

    System.out.println(res);
  }

  /**
   * <a href="https://www.hackerrank.com/challenges/minimum-distances/problem">link</a>
   */
  private int minimumDistances(int[] a) {
    int min = Integer.MAX_VALUE;
    Map<Integer, Integer> m = new HashMap<>();

    for (int i = 0; i < a.length; i++) {

      if (m.containsKey(a[i])) {
        int d = m.get(a[i]);

        min = Math.abs(i - d) < min ? Math.abs(i - d) : min;
      }
      m.put(a[i], i);
    }

    return min == Integer.MAX_VALUE ? -1 : min;
  }
}
