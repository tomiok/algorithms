public class SinglyLinkedListNode {

  int data;
  SinglyLinkedListNode next;

  SinglyLinkedListNode(final int data) {
    this.data = data;
  }

  @Override
  public String toString() {
    return this.data + "->" + this.next;
  }
}
