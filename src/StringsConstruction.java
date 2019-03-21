import java.util.HashSet;
import java.util.Set;

public class StringsConstruction {

  public static void main(String[] args) {
    StringsConstruction s = new StringsConstruction();
    int res = s.stringConstruction("abcabc");
    System.out.println(res);
  }

  /**
   * <a href="https://www.hackerrank.com/challenges/string-construction/problem>link</a>
   *
   * @param s The string to construct
   *
   * @return The price to pay to construct the String.
   */
  private int stringConstruction(String s) {

    Set<Character> holder = new HashSet<>();
    for (char c : s.toCharArray()) {
      holder.add(c);
    }

    return holder.size();
  }
}
