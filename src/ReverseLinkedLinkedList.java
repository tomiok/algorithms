public class ReverseLinkedLinkedList {

    public static void main(final String[] args) {
        final ReverseLinkedLinkedList l = new ReverseLinkedLinkedList();
    }

    /**
     * <a href="https://www.hackerrank.com/challenges/reverse-a-linked-list/problem">link</a>
     *
     * @param node The linked list to revert.
     * @return The linked list reverted.
     */
    SinglyLinkedListNode reverse(final SinglyLinkedListNode node) {
        SinglyLinkedListNode result = new SinglyLinkedListNode(node.data);
        SinglyLinkedListNode _node = node.next;
        while (_node != null) {
            final SinglyLinkedListNode res = new SinglyLinkedListNode(_node.data);
            res.next = result;
            _node = _node.next;
            result = res;
        }
        return result;
    }
}
