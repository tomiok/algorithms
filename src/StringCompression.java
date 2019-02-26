import java.util.Stack;

public class StringCompression {

  public static void main(String[] args) {
    StringCompression compression = new StringCompression();
    String res = compression.compress("aappiiiiiioopi");
    String res2 = compression.compressNice("aappiiiiiioopi");
    System.out.println(res);
    System.out.println(res2);

  }

  private String compress(String s) {
    Stack<Character> chars = new Stack<>();
    String result = "";
    for (char c : s.toCharArray()) {
      if (chars.isEmpty() || chars.peek().equals(c)) {
        chars.add(c);
      } else {
        result = result + chars.peek() + chars.size();
        chars.clear();
        chars.add(c);
      }
    }               // Get the last chars in the stack
    return result + chars.peek() + chars.size();
  }

  private String compressNice(String s) {
    int counter = 0;
    String res = "";
    for (int i = 0; i < s.length(); i++) {
      counter++;
      if (i + 1 >= s.length() || s.charAt(i) != s.charAt(i + 1)) {
        res = res + s.charAt(i) + counter;
        counter = 0;
      }
    }
    return res;
  }
}
