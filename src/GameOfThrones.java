public class GameOfThrones {

  public static void main(String[] args) {
    GameOfThrones g = new GameOfThrones();
    String res = g.gameOfThrones("aabbbaa");
    System.out.println(res);
  }

  private String gameOfThrones(String s) {
    String yes = "YES";
    String no = "NO";
    boolean even = s.length() % 2 == 0;

    char[] holder = new char[26];

    s.chars().forEach(c -> holder[c - 97]++);

    int check = 0;
    for (int i = 0; i< holder.length; i++) {
      if (even && holder[i] % 2 != 0) {
        return no;
      } else {
        if (holder[i] % 2 != 0) {
          check++;
        }
      }
    }

    return check > 1 ? no : yes;
  }
}
