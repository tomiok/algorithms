public class GetNodeValue {

  public static void main(String[] args) {
    GetNodeValue get = new GetNodeValue();
    int res = get.getNodeValue(new SinglyLinkedListNode(1), 1);
    System.out.println(res);
  }

  /**
   * <a href="https://www.hackerrank.com/challenges/get-the-value-of-the-node-at-a-specific-position-from-the-tail/problem">link</a>
   */
  private int getNodeValue(SinglyLinkedListNode node, int pos) {
    SinglyLinkedListNode pointer = node;
    int pointerPosition = 0;

    while (node.next != null) {
      node = node.next;
      if (pointerPosition < pos) {
        pointerPosition++;
      } else {
        pointer = pointer.next;
      }
    }

    return pointer.data;
  }
}
