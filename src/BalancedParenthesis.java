import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class BalancedParenthesis {

  public static void main(String[] args) {
    BalancedParenthesis balanced = new BalancedParenthesis();
    boolean res = balanced.isBalanced("{{{}}}()()(]");
    System.out.println(res);
  }

  private boolean isBalanced(String s) {
    Map<Character, Integer> m = new HashMap<>();

    for (Character c : s.toCharArray()) {
      if (c == ']') {
        Integer res = m.computeIfPresent('[', (k, v) -> v = v - 1);
        if (res == null) {
          return false;
        }
      } else if (c == '}') {
        Integer res = m.computeIfPresent('{', (k, v) -> v = v - 1);
        if (res == null) {
          return false;
        }
      } else if (c == ')') {
        Integer res = m.computeIfPresent('(', (k, v) -> v = v - 1);
        if (res == null) {
          return false;
        }
      } else {
        if (m.containsKey(c)) {
          m.computeIfPresent(c, (k, v) -> v = v + 1);
        } else {
          m.put(c, 1);
        }
      }
    }

    Integer r1 = Optional.ofNullable(m.get('(')).orElse(0);
    Integer r2 = Optional.ofNullable(m.get('{')).orElse(0);
    Integer r3 = Optional.ofNullable(m.get('[')).orElse(0);

    return (r1 + r2 + r3) == 0;
  }

  private boolean isBalanced_2(String s) {

    return false;
  }
}
