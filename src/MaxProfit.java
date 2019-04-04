public class MaxProfit {

  public static void main(String[] args) {
    MaxProfit m = new MaxProfit();
    int[] arr = {45, 24, 35, 31, 40, 38, 11};

    int profit = m.max(arr);
    System.out.println(profit);
  }

  private int max(int[] arr) {
    int buy = Integer.MAX_VALUE;
    int sell = Integer.MIN_VALUE;
    int profit = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
      if (i+1 <= arr.length-1) {
        buy = arr[i] < buy ? arr[i] : buy;
        sell = arr[i+1] > sell ? arr[i+1] : sell;

        profit = sell - buy > profit ? sell - buy : profit;
      }
    }

    return profit;
  }
}
