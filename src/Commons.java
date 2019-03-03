import java.util.ArrayList;
import java.util.List;

class Commons {

  static SinglyLinkedListNode list(int... values) {
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
