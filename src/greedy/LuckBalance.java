package greedy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LuckBalance {

  public static void main(String[] args) {
    LuckBalance lb = new LuckBalance();
    int[][] a = { { 13, 1 }, { 10, 1 }, { 9, 1 }, { 8, 1 }, { 13, 1 }, { 12, 1 }, { 18, 1 }, { 13, 1 } };
    int[][] a2 = { { 5, 1 }, { 2, 1 }, { 1, 1 }, { 8, 1 }, { 10, 0 }, { 5, 0 } };
    int[][] a3 = { { 5, 1 }, { 4, 0 }, { 6, 1 }, { 8, 0 }, { 2, 1 } };
    int res = luckBalance(2, a3);
    System.out.println(res);
  }

  static int luckBalance(int k, int[][] contests) {
    int lucky = 0;
    int size = contests.length;
    List<Integer> res = new ArrayList<>(size);
    for (int[] contest : contests) {
      if (contest[1] == 0) {
        lucky += contest[0];
      } else {
        res.add(contest[0]);
      }
    }

    res.sort(Comparator.naturalOrder());
    int toWin = res.size() - k;

    int n = res.subList(toWin, res.size()).stream().mapToInt(Integer::intValue).sum() - toWin;

    return lucky + n;
  }
}
