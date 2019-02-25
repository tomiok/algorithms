public class PetrolPumps {

  public static void main(final String[] args) {
    final PetrolPumps p = new PetrolPumps();

    final int[][] arr = { { 1, 1 }, { 44, 44 }, { 36, 36 } };
    p.truckTour(arr);
  }

  private int truckTour(final int[][] pumps) {
    for (final int[] x : pumps) {
      for (final int y : x) {
        System.out.print(y + " ");
      }
      System.out.println();
    }

    return 1;
  }
}
