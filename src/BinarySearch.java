public class BinarySearch {

  public static void main(String[] args) {
    BinarySearch bs = new BinarySearch();
    int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
    int result = bs.bs(arr, 1, 0, arr.length);
    System.out.println(result);
  }

  private int bs(int[] arr, int num, int low, int high) {
    final int mid = (low + high) / 2;

    if (arr[mid] == num) {
      return mid;
    }

    if (num > arr[mid]) {
      return bs(arr, num, mid, high);
    } else {
      return bs(arr, num, low, mid);
    }
  }

}
