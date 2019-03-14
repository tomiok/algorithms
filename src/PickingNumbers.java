import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PickingNumbers {

  public static void main(final String[] args) {
    final int res = pickingNumbers(Arrays.asList(1, 2, 2, 3, 1, 2));
    System.out.println(res);
  }

  /**
   * <a href="https://www.hackerrank.com/challenges/picking-numbers/problem">link</a>
   */
  private static int pickingNumbers(final List<Integer> a) {
    final List<Integer> b = new ArrayList<>(a);
    return a.stream().distinct().map(
        n -> (int) b.stream().filter(r -> r.equals(n) || r.equals(n - 1)).count())
        .max(Integer::compareTo)
        .orElse(0);
  }

  void a(final List<Integer> a) {
    a.stream().distinct()
        .map(n -> (int) a.stream().filter(n0 -> n0 == n || n0 == n + 1).count())
        .max(Integer::compareTo).orElse(0);
  }

}
