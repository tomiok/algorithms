public class ViralAdvertising {

  public static void main(String[] args) {
    ViralAdvertising v = new ViralAdvertising();
    System.out.println(v.peopleWhoSeeTheAd(5));
  }

  /**
   * Assuming that the company ALWAYS show the add to 5 people at the first day and then, the half
   * of the audience like the add and those will show to another 3 friends.
   *
   * <a href= https://www.hackerrank.com/challenges/strange-advertising/problem>link</a>
   *
   * @param numOfDays the number of days of the Ad.
   *
   * @return the number of people who saw the Ad.
   */
  private int peopleWhoSeeTheAd(int numOfDays) {
    if (numOfDays > 50) {
      throw new IllegalArgumentException("50 days at max");
    }
    int initialShared = 5;
    int initialLiked = Math.floorDiv(initialShared, 2);
    int liked = initialLiked;
    int sum = initialLiked;

    for (int i = 2; i <= numOfDays; i++) {
      liked = Math.floorDiv(liked * 3, 2);
      sum += liked;
    }

    return sum;
  }
}
