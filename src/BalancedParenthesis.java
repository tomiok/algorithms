import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Stack;

public class BalancedParenthesis {

  public static void main(String[] args) {
    BalancedParenthesis balanced = new BalancedParenthesis();
    boolean res = balanced.isBalanced_2("{{{}}}()()()");
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
    Stack<Character> stack = new Stack<>();

    for (char c : s.toCharArray()) {
      if (!stack.empty() && isClosing(c)) {
        if ((stack.peek() - c) != -1 || (stack.peek() - c) != -2) {
          stack.pop();
        } else {
          return false;
        }

      } else {
        stack.add(c);
      }
    }

    return stack.isEmpty();
  }

  private boolean isClosing(char c) {
    return c == '}' || c == ']' || c == ')';
  }
}
