public class InsertAtHead {

    public static void main(final String[] args) {
        final InsertAtHead head = new InsertAtHead();

    }

    /**
     * <a href="https://www.hackerrank.com/challenges/insert-a-node-at-the-head-of-a-linked-list/problem">link</a>
     *
     * @param llist The linked list passed.
     * @param data  The data inside the node.
     * @return The linked list with the node at the head.
     */
    private SinglyLinkedListNode insertNodeAtHead(final SinglyLinkedListNode llist, final int data) {
        final SinglyLinkedListNode node = new SinglyLinkedListNode(data);
        node.next = llist;
        return node;
    }
}
