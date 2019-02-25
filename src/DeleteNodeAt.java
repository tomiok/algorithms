public class DeleteNodeAt {

  public static void main(final String[] args) {
    final DeleteNodeAt deleteNodeAt = new DeleteNodeAt();
  }

  /**
   * <a href="https://www.hackerrank.com/challenges/delete-a-node-from-a-linked-list/problem">link</a>
   *
   * @param llist    The linked list.
   * @param position The position for the node to delete
   *
   * @return The linked list with the node deleted.
   */
  private SinglyLinkedListNode deleteNode(final SinglyLinkedListNode llist, final int position) {
    if (position == 0) {
      return llist.next;
    }

    int i = 1;
    SinglyLinkedListNode node = llist;

    while (node != null) {
      if (i == position) {
        node.next = node.next.next;
        i++;
      } else {
        i++;
        node = node.next;
      }
    }

    return llist;
  }
}
