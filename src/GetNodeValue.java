public class GetNodeValue {

  public static void main(String[] args) {
    GetNodeValue get = new GetNodeValue();
    int res = get.getNodeValue(new SinglyLinkedListNode(1), 1);
    System.out.println(res);
  }

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
