import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FreqQuery {

  public static void main(String[] args) {
    FreqQuery fq = new FreqQuery();
  }

  static List<Integer> freqQuery(List<int[]> queries) {
    List<Integer> result = new ArrayList<>(queries.size());
    Map<Integer, Integer> values = new HashMap<>();
    Set<Integer> occs = new HashSet<>(queries.size());
    int counter = 0;
    for (int[] q : queries) {
      //insert one occurrence
      int operation = q[0];
      int val = q[1];
      if (operation == 1) {
        if (values.containsKey(val)) {
          values.compute(val, (k, v) -> v += 1);
        } else {
          values.put(val, 1);
        }
      } else if (operation == 2) {  // delete one occurrence
        values.computeIfPresent(val, (k, v) -> v -= 1);
      } else if (operation == 3) { // check if the value is saved n times
        if (counter < q[1]) {
          result.add(0);
        } else {
          occs.addAll(values.values());
          if (occs.contains(q[1])) {
            result.add(1);
          } else {
            result.add(0);
          }
        }
      }
      counter++;
    }
    return result;
  }


}
