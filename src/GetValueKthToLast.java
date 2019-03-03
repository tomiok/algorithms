public class GetValueKthToLast {

  public static void main(String[] args) {
    GetValueKthToLast instance = new GetValueKthToLast();
    SinglyLinkedListNode node = Commons.list(1,2,3,4,5,6,7,8);
    int t = instance.deleteKthToLast(node, 3);
    System.out.println(t);
  }

  private int deleteKthToLast(SinglyLinkedListNode node, int pos) {
    int pointer = 0;
    SinglyLinkedListNode head = node;
    while (node.next != null) {
      if (pointer >= pos) {
        head = head.next;
      }
      pointer++;
      node = node.next;
    }
    return head.data;
  }
}
