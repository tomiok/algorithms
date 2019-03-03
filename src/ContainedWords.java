import java.util.HashMap;
import java.util.Map;

public class ContainedWords {

  public static void main(String[] args) {
    ContainedWords cw = new ContainedWords();
    boolean res = cw.areContained("hey dj subeme la musica", "hey dj subeme la musica");
    System.out.println(res);
  }

  /**
   * Given 2 sentences, determine if one has enough words to complete the other Assuming s1 is
   * always longer than s2
   */
  private boolean areContained(String s1, String s2) {
    String[] ss1 = s1.split(" ");
    String[] ss2 = s2.split(" ");

    Map<String, Integer> holder = putInMap(ss1);

    for (String s : ss2) {
      if (!holder.containsKey(s)) {
        return false;
      }
    }
    return true;
  }

  private Map<String, Integer> putInMap(String[] s) {
    Map<String, Integer> holder = new HashMap<>();

    for (String str : s) {
      if (holder.containsKey(str)) {
        holder.compute(str, (k, v) -> v = v + 1);
      } else {
        holder.put(str, 1);
      }
    }

    return holder;
  }
}
