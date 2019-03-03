import java.util.HashMap;
import java.util.Map;

public class RepeatedString {

  public static void main(String[] args) {
    RepeatedString rs = new RepeatedString();
    long result = rs.repeatedString_2(10, "aba");
    System.out.println(result);
  }


  private int repeatedString(int length, String s) {

    if (s.length() == 1) {
      return length;
    }

    int i = 0;
    char[] chars = s.toCharArray();
    Map<Character, Integer> m = new HashMap<>();

    while (i < length) {
      if (i >= chars.length) {
        int factor = i % chars.length;
        m.compute(chars[factor], (k, v) -> v += 1);

      } else {

        if (m.containsKey(chars[i])) {
          m.compute(chars[i], (k, v) -> v += 1);
        } else {
          m.put(chars[i], 1);
        }
      }
      i++;
    }

    return m
        .entrySet()
        .stream()
        .max(Map.Entry.comparingByValue())
        .orElseThrow(RuntimeException::new)
        .getValue();
  }

  /**
   * Effective solution for:
   * <a href="https://www.hackerrank.com/challenges/repeated-string/problem">link</a>
   *
   * @param length The String length
   * @param s The input String
   * @return The number of occurrences
   */
  private long repeatedString_2(long length, String s) {

    if (s.length() == 1 && s.equals("a")) {
      return length;
    }

    int i = 0;
    int sum = 0;

    char[] chars = s.toCharArray();
    while (i < s.length()) {
      if (chars[i] == 'a') {
        sum++;
      }
      i++;
    }

    long rest = length % Integer.toUnsignedLong(s.length());
    int j = 0;
    int restLetter = 0;

    while (j < rest) {
      if (chars[j] == 'a') {
        restLetter++;
      }
      j++;
    }
    long laps = length / Integer.toUnsignedLong(s.length());
    return (sum * laps) + restLetter;
  }
}
