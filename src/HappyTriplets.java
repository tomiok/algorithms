public class HappyTriplets {

  public static void main(String[] args) {
    HappyTriplets h = new HappyTriplets();
    int[] arr = { 1, 6, 7, 7, 8, 10, 12, 13, 14, 19 };
    int s = h.beautifulTriplets(3, arr);
    System.out.println(s);
  }

  /**
   * <a href="https://www.hackerrank.com/challenges/beautiful-triplets/problem">link</a>
   *
   * @param d   The magic number.
   * @param arr the increasing array.
   *
   * @return Number of triplets found.
   */
  private int beautifulTriplets(int d, int[] arr) {
    int tmp = 0;
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] - arr[i] == d) {
          tmp = arr[j];
          continue;
        }
        if (arr[j] - tmp == d) {
          count++;
          break;
        }
      }
      tmp = 0;
    }

    return count;
  }

}
