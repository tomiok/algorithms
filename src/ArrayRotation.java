public class ArrayRotation {

  public static void main(String[] args) {
    System.out.println(4%2);
    System.out.println(5%7);
    System.out.println(6%7);

    ArrayRotation rotation = new ArrayRotation();
    int[] arr = {1, 2, 3, 4, 5};
    int[] res = rotation.rotate(arr, 4);

  }

  private int[] rotate(int[] arr, int n) {
    int[] nArr = new int[arr.length];
    for (int t = 0; t < arr.length; t++) {
      nArr[formula(t, n, arr.length)] = arr[t];
    }
    return nArr;
  }

  private int formula(int position, int shift, int length) {
    if (position < shift) {
      int n = Math.abs(position - shift);
      return Math.abs(n - length);
    } else {
      return position - shift;
    }
  }
}
