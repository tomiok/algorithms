import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CompareLinkedLists {

    public static void main(final String[] args) {
        final CompareLinkedLists c = new CompareLinkedLists();
    }

    private boolean compare(final SinglyLinkedListNode node1, final SinglyLinkedListNode node2) {

        SinglyLinkedListNode n1 = node1;
        SinglyLinkedListNode n2 = node2;
        final List<Integer> data1 = new ArrayList<>();
        final List<Integer> data2 = new ArrayList<>();
        while (n1 != null) {
            data1.add(n1.data);
            n1 = n1.next;
        }

        while (n2 != null) {
            data2.add(n2.data);
            n2 = n2.next;
        }

        if (data1.size() != data2.size()) {
            return false;
        }

        for (int i = 0; i < data1.size(); i++) {
            if (!Objects.equals(data1.get(i), data2.get(i))) {
                return false;
            }
        }
        return true;
    }
}
