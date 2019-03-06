public class ArrayRotation {

  public static void main(String[] args) {

    ArrayRotation rotation = new ArrayRotation();
    int[] arr = {41, 73, 89, 7, 10, 1, 59, 58, 84, 77, 77, 97, 58, 1, 86, 58, 26, 10, 86, 51};
    int[] res = rotation.rotate(arr, 10);
    for (int i : res) {
      System.out.print(i + " ");
    }
  }

  private int[] rotate(int[] arr, int n) {
    int[] nArr = new int[arr.length];
    for (int t = 0; t < arr.length; t++) {
      nArr[formula_2(t, n, arr.length)] = arr[t];
    }
    return nArr;
  }

  private static int formula(int position, int shift, int length) {
    if (position < shift) {
      int n = Math.abs(position - shift);
      return Math.abs(n - length);
    } else {
      return position - shift;
    }
  }

  private static int formula_2(int position, int shift, int length) {
    if (position < shift) {
      int k =  position - (shift % length);
      return k < 0 ? k + length : k;
    } else {
      return position - shift;
    }
  }
}
