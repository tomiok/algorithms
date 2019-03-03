import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDupsLinkedList {

  public static void main(String[] args) {
    RemoveDupsLinkedList r = new RemoveDupsLinkedList();
    SinglyLinkedListNode node = r.list(1,2,3,4,5);
    r.removeDuplicates(node);
    System.out.println(node);
    SinglyLinkedListNode repeated = r.list(1,2,3,3,5);
    r.removeDuplicates(repeated);
    System.out.println(repeated);
    SinglyLinkedListNode repeated2 = r.list(1,2,3,3,5,5);
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

  private SinglyLinkedListNode list(int... values) {
    List<SinglyLinkedListNode> nodes = new ArrayList<>();
    for (int value : values) {
      nodes.add(new SinglyLinkedListNode(value));
    }
    for (int i = 0; i < nodes.size(); i++) {
      if (i + 1 < nodes.size()) {
        nodes.get(i).next = nodes.get(i + 1);
      }
    }
    return nodes.get(0);
  }
}
