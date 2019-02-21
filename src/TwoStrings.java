public class TwoStrings {

  public static void main(String[] args) {
    TwoStrings s = new TwoStrings();

    String res = s.twoStrings("hiiiiiiiiiiiuiuytiuytiyutuiyutiuiytl", "world");
    System.out.println(res);
  }

  private String twoStrings(String s1, String s2) {
    String res = "NO";
    char[] cc = s1.toCharArray();
    for (char i : cc){
      if(s2.contains(String.valueOf(i))) {
        return "YES";
      }
    }
    return res;
  }

}
