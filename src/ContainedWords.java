import java.util.HashMap;
import java.util.Map;

public class ContainedWords {

  public static void main(String[] args) {
    ContainedWords cw = new ContainedWords();
    boolean res = cw.areContained("Hey DJ subeme la musica", "hey DJ");
    System.out.println(res);
  }

  /**
   * Given 2 sentences, determine if one has enough words to complete the other
   */
  private boolean areContained(String s1, String s2) {
    String[] ss1 = s1.split(" ");
    String[] ss2 = s2.split(" ");

    Map<String, Integer> holder = ss1.length >= ss2.length ? longerInMap(ss1) : longerInMap(ss2);

    return false;
  }

  private Map<String, Integer> longerInMap(String[] s) {
    Map<String, Integer> holder = new HashMap<>();

    for (String str : s) {
      if (holder.containsKey(str)) {
        holder.compute(str, (k,v) -> v = v+1);
      } else {
        holder.put(str, 1);
      }
    }

    return holder;
  }
}
