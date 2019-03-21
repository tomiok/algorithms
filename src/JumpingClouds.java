public class JumpingClouds {

  public static void main(String[] args) {
    JumpingClouds clouds = new JumpingClouds();
    int[] arr = { 0, 0, 1, 0, 0, 0, 0, 1, 0 };
    int res = clouds.jump(arr);
    System.out.println(res);
  }

  /**
   * <a href="https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem">link</a>
   *
   * @param arr Binary array
   *
   * @return min num of jumps
   */
  private int jump(int[] arr) {
    int jumps = 0;
    boolean chain = false;
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] == 0) {

        jumps++;
        if (i == 1) {
          continue;
        }

        if (arr[i - 1] == 0 && arr[i - 2] == 0 & !chain) {
          jumps--;
          chain = true;
        } else {
          chain = false;
        }
      }

    }
    return jumps;
  }
}
