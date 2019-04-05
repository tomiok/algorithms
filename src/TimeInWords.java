public class TimeInWords {

  public static void main(String[] args) {
    TimeInWords t = new TimeInWords();
    String s = t.timeInWords(7, 15);
    System.out.println(s);
  }

  /**
   * <a href="https://www.hackerrank.com/challenges/the-time-in-words/problem">link</a>
   */
  private String timeInWords(int h, int m) {

    String[] arr = {
        "zero",
        "one",
        "two",
        "three",
        "four",
        "five",
        "six",
        "seven",
        "eight",
        "nine",
        "ten",
        "eleven",
        "twelve",
        "thirteen",
        "fourteen",
        "fifteen",
        "sixteen",
        "seventeen",
        "eighteen",
        "nineteen",
        "twenty",
        "twenty one",
        "twenty two",
        "twenty three",
        "twenty four",
        "twenty five",
        "twenty six",
        "twenty seven",
        "twenty eight",
        "twenty nine"
    };

    String res = "";

    if (m == 0) {
      return arr[h] + " o' clock";
    } else if (m == 15) {
      res = "quarter past ";
    } else if (m == 30) {
      res = "half past ";
    }

    if (!res.isEmpty()) {
      return res + arr[h];
    }

    if (m < 30 && m > 1) {
      return arr[m] + " minutes past " + arr[h];
    }

    if (m < 30 && m == 1) {
      return arr[m] + " minute past " + arr[h];
    }

    if (m == 45) {
      return "quarter to " + arr[h + 1];
    }

    if (m > 30) {
      return arr[60 - m] + " minutes to " + arr[h + 1];
    }

    return "";
  }
}
