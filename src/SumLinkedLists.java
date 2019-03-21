public class SumLinkedLists {

  public static void main(String[] args) {
    SumLinkedLists s = new SumLinkedLists();
    int result = s.sum(Commons.list(6, 1, 7), Commons.list(2, 9, 5));
    System.out.println(result);
  }

  private int sum(SinglyLinkedListNode node1, SinglyLinkedListNode node2) {
    StringBuilder sb = new StringBuilder();
    while (node1.next != null) {
      sb.append(node1.data);
      node1 = node1.next;
    }
    sb.append(node1.data);
    int first = Integer.valueOf(sb.toString());

    StringBuilder sb2 = new StringBuilder();
    while (node2.next != null) {
      sb2.append(node2.data);
      node2 = node2.next;
    }
    sb2.append(node2.data);
    int second = Integer.valueOf(sb2.toString());

    return first + second;
  }
}
