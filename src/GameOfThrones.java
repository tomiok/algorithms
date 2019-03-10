public class GameOfThrones {

  public static void main(final String[] args) {
    final GameOfThrones g = new GameOfThrones();
    final String res = g.gameOfThrones("aabbbbbbbbbbbaa");
    System.out.println(res);
  }

  private String gameOfThrones(final String s) {
    final String yes = "YES";
    final String no = "NO";
    final boolean even = s.length() % 2 == 0;

    final char[] holder = new char[26];

    s.chars().forEach(c -> holder[c - 97]++);

    int check = 0;
    for (final char aHolder : holder) {
      if (even && aHolder % 2 != 0) {
        return no;
      } else {
        if (aHolder % 2 != 0) {
          check++;
        }
      }
    }

    return check > 1 ? no : yes;
  }
}
