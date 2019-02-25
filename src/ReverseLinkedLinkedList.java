public class ReverseLinkedLinkedList {

  public static void main(final String[] args) {
    final ReverseLinkedLinkedList l = new ReverseLinkedLinkedList();
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
}
