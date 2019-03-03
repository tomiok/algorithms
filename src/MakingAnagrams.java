public class MakingAnagrams {

  public static void main(String[] args) {
    MakingAnagrams makingAnagrams = new MakingAnagrams();
    int result = makingAnagrams.makeAnagram("cdeewrewr", "abc");

    System.out.println(result);
  }

  /**
   * <a href="https://www.hackerrank.com/challenges/making-anagrams/problem">link</a>
   *
   * @param s1 The first String
   * @param s2 The second String
   * @return The number of deletion to get the anagram
   */
  private int makeAnagram(String s1, String s2) {
    int count = 0;

    int[] one = new int[26];
    int[] two = new int[26];

    for (int i = 0; i < s1.length(); i++) {
      one[s1.charAt(i) - 97]++;
    }

    for (int i = 0; i < s2.length(); i++) {
      two[s2.charAt(i) - 97]++;
    }

    for (int i = 0; i < one.length; i++) {
      count += Math.abs(one[i] - two[i]);
    }

    return count;
  }
}
