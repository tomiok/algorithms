public class CheckAnagrams {

  public static void main(String[] args) {
    CheckAnagrams c = new CheckAnagrams();

    boolean b = c.checkIfAnagram("holadonpepito", "donpepitohola");
    System.out.println(b);
  }

  /**
   * @param s1 The first String
   * @param s2 The second String
   *
   * @return True if it is an anagram, otherwise false.
   */
  private boolean checkIfAnagram(String s1, String s2) {
    if (s1.length() != s2.length()) {
      return false;
    }

    int[] one = new int[26];
    int[] two = new int[26];

    int res = 0;

    for (int i = 0; i < s1.length(); i++) {
      one[s1.charAt(i) - 97]++;
    }

    for (int i = 0; i < s2.length(); i++) {
      two[s2.charAt(i) - 97]++;
    }

    for (int i = 0; i < s1.length(); i++) {
      res += Math.abs(one[i] - two[i]);
    }
    return res == 0;
  }
}
