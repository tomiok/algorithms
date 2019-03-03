public class CircularLinkedLists {

  public static void main(String[] args) {
    CircularLinkedLists c = new CircularLinkedLists();

  }

  private SinglyLinkedListNode circular(SinglyLinkedListNode node) {
    SinglyLinkedListNode slow = node;
    SinglyLinkedListNode fast = node;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;

      //found collision
      if (slow == fast) {
        break;
      }
    }

    //no collisions
    if (fast == null || fast.next == null) {
      return null;
    }

    return slow;
  }
}
