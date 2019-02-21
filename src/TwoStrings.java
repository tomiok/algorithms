public class TwoStrings {

  public static void main(String[] args) {
    TwoStrings s = new TwoStrings();

    String res = s.twoStrings("hiiiiiiiiiiiuiuytiuytiyutuiyutiuiytl", "world");
    System.out.println(res);
  }

  private String twoStrings(String s1, String s2) {
    for(int i=97;i<(97+25);i++)
    {
      if(s1.indexOf(i)!=-1&& s2.indexOf(i)!=-1)
      {
        return "YES";
      }
    }
    return "NO";
  }

}
