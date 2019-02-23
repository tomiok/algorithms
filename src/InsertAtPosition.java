public class InsertAtPosition {

    public static void main(final String[] args) {
        final InsertAtPosition i = new InsertAtPosition();
    }

    /**
     * <a href="https://www.hackerrank.com/challenges/insert-a-node-at-a-specific-position-in-a-linked-list/problem">link</a>
     *
     * @param llist    The linked list
     * @param data     The data to insert
     * @param position The position to insert the data
     * @return The modified list.
     */
    SinglyLinkedListNode insertAt(final SinglyLinkedListNode llist, final int data, final int position) {
        SinglyLinkedListNode node = llist;
        int i = 1;
        while (node != null) {
            if (i == position) {
                final SinglyLinkedListNode toInsert = new SinglyLinkedListNode(data);
                toInsert.next = node.next;
                node.next = toInsert;
                i++;
                node = node.next;
            } else {
                i++;
                node = node.next;
            }
        }

        return llist;
    }
}
