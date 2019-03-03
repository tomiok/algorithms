public class PetrolPumps {

  public static void main(final String[] args) {
    final PetrolPumps p = new PetrolPumps();

    final int[][] arr = {{1, 5}, {10, 3}, {3, 4}};
    int res = p.truckTour(arr);
    System.out.println(res);
  }

  private int truckTour(final int[][] pumps) {
    int index = 0;
    int res = 0;
    for (final int[] x : pumps) {
      if (x[0] > x[1] && res == 0 && res <= index) {
        res = index;
      }
      index++;
    }

    return res;
  }
}
