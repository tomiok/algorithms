public class ReverseLinkedLinkedList {

  public static void main(final String[] args) {
    final ReverseLinkedLinkedList l = new ReverseLinkedLinkedList();
    SinglyLinkedListNode node = Commons.list(1, 2, 3, 4, 5, 6, 7);
    SinglyLinkedListNode result = l.reverse_2(node);
    System.out.println(result);
  }

  /**
   * <a href="https://www.hackerrank.com/challenges/reverse-a-linked-list/problem">link</a>
   *
   * @param node The linked list to revert.
   *
   * @return The linked list reverted.
   */
  private SinglyLinkedListNode reverse(final SinglyLinkedListNode node) {
    //Get the first element and put in the new linked list
    SinglyLinkedListNode result = new SinglyLinkedListNode(node.data);
    //Get a new linkedlist to iterate
    SinglyLinkedListNode _node = node.next;
    while (_node != null) {
      //save the result "of the nex element" in a node
      final SinglyLinkedListNode res = new SinglyLinkedListNode(_node.data);
      //put the element at the beginning
      res.next = result;
      //go thru next element
      _node = _node.next;
      //swap the results
      result = res;
    }
    return result;
  }

  private SinglyLinkedListNode reverse_2(SinglyLinkedListNode head) {
    SinglyLinkedListNode current = head;
    SinglyLinkedListNode previous = null;
    SinglyLinkedListNode next = null;

    while (current != null) {
      next = current.next;
      current.next = previous;
      previous = current;
      current = next;
    }
    head = previous;
    return head;
  }
}
