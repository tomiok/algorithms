import java.util.HashSet;
import java.util.Set;

public class RemoveDupsLinkedList {

  public static void main(String[] args) {
    RemoveDupsLinkedList r = new RemoveDupsLinkedList();
    SinglyLinkedListNode node = Commons.list(1, 2, 3, 4, 5);
    r.removeDuplicates(node);
    System.out.println(node);
    SinglyLinkedListNode repeated = Commons.list(1, 2, 3, 3, 5);
    r.removeDuplicates(repeated);
    System.out.println(repeated);
    SinglyLinkedListNode repeated2 = Commons.list(1, 2, 3, 3, 5, 5);
    r.removeDuplicates(repeated2);
    System.out.println(repeated2);
  }

  private void removeDuplicates(SinglyLinkedListNode node) {
    Set<Integer> resHolder = new HashSet<>();
    resHolder.add(node.data);

    while (node.next != null) {
      if (resHolder.contains(node.next.data)) {
        node.next = node.next.next;
      } else {
        resHolder.add(node.next.data);
        node = node.next;
      }
    }
  }
}
