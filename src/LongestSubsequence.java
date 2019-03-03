import java.util.Stack;

public class LongestSubsequence {

  public static void main(String[] args) {
    LongestSubsequence longest = new LongestSubsequence();
    int[] arr = {1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3};
    int res = longest.longestSequence(arr);
    System.out.println(res);
  }

  /**
   * Get the longest sub sequence of the same int
   *
   * @param arr The input array
   * @return The number of occurrences int the array.
   */
  private int longestSequence(int[] arr) {
    Stack<Integer> stack = new Stack<>();

    stack.add(arr[0]);
    int sequence = 0;
    for (int i = 1; i < arr.length; i++) {
      if (stack.peek().equals(arr[i])) {
        stack.add(arr[i]);
      } else {
        if (sequence < stack.size()) {
          sequence = stack.size();
          stack.removeAllElements();
        }
        stack.add(arr[i]);
      }
    }

    return sequence;
  }
}
