import java.util.HashMap;
import java.util.Map;

public class SequenceEquation {

  public static void main(String[] args) {
    SequenceEquation s = new SequenceEquation();
    int[] arr = { 2, 3, 1 };
    //int[] res = s.permutation(arr);
    int[] res = s.permutation_2(arr);

    for (int a : res) {
      // -1 is to fix the 0 indexed array.
      System.out.println(arr[arr[a - 1] - 1]);
    }
  }

  /**
   * <a href="https://www.hackerrank.com/challenges/permutation-equation/problem">link</a>
   *
   * @param p The sequence.
   *
   * @return The permutation.
   */
  private int[] permutation(int[] p) {
    int[] result = new int[p.length];

    Map<Integer, Integer> m = new HashMap<>();

    for (int i = 1; i <= p.length; i++) {

      int index = 0;

      for (int j = 0; j < p.length; j++) {
        m.put(p[j], j + 1);
        if (i == p[j]) {
          index = j;
        }
      }
      result[i - 1] = m.get(index + 1);
    }
    return result;
  }

  private int[] permutation_2(int[] p) {
    Map<Integer, Integer> m = new HashMap<>();
    int[] arr = new int[p.length];
    for (int i = 0; i <= p.length - 1; i++) {
      m.put(p[i], i + 1);
    }
    for (int i = 1; i <= p.length; i++) {
      arr[i - 1] = m.get(m.get(i));
    }
    return arr;
  }
}
