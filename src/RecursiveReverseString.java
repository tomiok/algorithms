public class RecursiveReverseString {

  public static void main(String[] args) {
    String s = "hello";
    RecursiveReverseString r = new RecursiveReverseString();
    r.reverse(s.toCharArray(), 0);
  }

  private void reverse(char[] s, int index) {
    if (s.length == 0 || index >= s.length) {
      return;
    }

    index++;
    reverse(s, index);
    System.out.print(s[index - 1]);
  }
}
