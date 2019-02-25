public class PrintReversedLinkedList {

  public static void main(final String[] args) {
    final PrintReversedLinkedList printReversedLinkedList = new PrintReversedLinkedList();
  }

  /**
   * <a href="https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list-in-reverse/problem">link</a>
   *
   * @param llist The list to reverse.
   */
  void printReverse(final SinglyLinkedListNode llist) {
    if (llist == null) {
      return;
    }
    printReverse(llist.next);
    System.out.println(llist.data);
  }
}
