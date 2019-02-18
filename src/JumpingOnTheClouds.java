public class JumpingOnTheClouds {

  public static void main(String[] args) {
    JumpingOnTheClouds j = new JumpingOnTheClouds();
    int[] arr = new int[]{0, 0, 1, 0, 0, 1, 1, 0};
    int energy = j.jumps(arr, 2);
    System.out.println(energy);
  }

  /**
   * <a href="https://www.hackerrank.com/challenges/jumping-on-the-clouds-revisited/problem">link</a>
   *
   * @param clouds Array with the clouds, the 0s are clouds and the 1s are thunderheads clouds.
   * @param k Number of jumps. Energy decrease 1 by any jump and 2 extra if the cloud is with
   * thunders
   * @return The Energy when she is back in the first cloud.
   */
  private int jumps(int[] clouds, int k) {
    int f = 0;
    int energy = 100;
    while (f <= clouds.length - 1) {
      if (clouds[f] == 1) {
        energy -= 2;
      }
      energy--;
      f += k;
    }

    return energy;
  }
}
