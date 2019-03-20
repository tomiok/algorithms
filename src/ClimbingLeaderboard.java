public class ClimbingLeaderboard {

  public static void main(final String[] args) {
    final int[] leaders = {100, 100, 50, 40, 40, 20, 10};
    final int[] alice = {5, 25, 50, 120};
    final int[] res = climbingLeaderboard(leaders, alice);

    for (final int re : res) {
      System.out.println(re);
    }
  }

  private static int[] climbingLeaderboard(final int[] scores, final int[] alice) {
    //final List<Integer> scoreList = Arrays.stream(scores).boxed().distinct().collect(Collectors.toList());
    final int[] results = new int[alice.length];
    boolean last = true;
    int reps = 0;
    for (int i = 0; i < alice.length; i++) {
      for (int j = 0; j < scores.length; j++) {
        if (j - 1 >= 0 && scores[j] == scores[j - 1]) {
          reps++;
        }
        if (alice[i] >= scores[j]) {
          last = false;
          results[i] = (j + 1 - reps);
          break;
        }
      }
      if (last) {
        results[i] = scores.length + 1 - reps;
      }
      reps = 0;
    }
    return results;
  }
}
