public class InsertAtTail {

  public static void main(final String[] args) {
    final InsertAtTail tail = new InsertAtTail();

    final SinglyLinkedListNode node1 = new SinglyLinkedListNode(1);
    final SinglyLinkedListNode node2 = new SinglyLinkedListNode(2);
    final SinglyLinkedListNode node3 = new SinglyLinkedListNode(3);

    node1.next = node2;
    node2.next = node3;

    final SinglyLinkedListNode node4 = tail.insertNodeAtTail(node1, 4);

    node3.next = node4;

    SinglyLinkedListNode n = node1;
    while (n != null) {
      System.out.println(n.data);
      n = n.next;
    }
  }

  private SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode llist, final int data) {
    if (llist == null) {
      llist = new SinglyLinkedListNode(data);
    } else {
      //assign the list to an iterable nodeList
      SinglyLinkedListNode node = llist;
      //Iterate over the list to get the last element
      while (node.next != null) {
        node = node.next;
      }
      //Add the element to the
      node.next = new SinglyLinkedListNode(data);
    }

    return llist;
  }
}