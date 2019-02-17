public class RecursiveDigitSum {

  public static void main(String[] args) {
    RecursiveDigitSum r = new RecursiveDigitSum();
    int su = r.sum("999999999999999999999999999999999999999999999", 100000000);
    int sum = r.sum("150", 3);

    System.out.println(sum);
  }

  /**
   * Example: s = 150, k = 3
   * 150150150
   * 1+5+0+1+5+0+1+5+0 = 18
   * 1+8 = 9
   * result = 9
   * <a href="https://www.hackerrank.com/challenges/recursive-digit-sum/problem">link</a>
   *
   * @param n The number in string format
   * @param k The times to be repeated
   *
   * @return The sum of each digit.
   */
  private int sum(String n, int k) {
    n = String.valueOf(n.chars().mapToLong(Character::getNumericValue).sum() * k);
    return n.length() == 1 ? Integer.valueOf(n) : sum(n, 1);
  }
}
