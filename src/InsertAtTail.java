public class InsertAtTail {

    public static void main(final String[] args) {
        final InsertAtTail tail = new InsertAtTail();

        final SinglyLinkedListNode node1 = tail.insertNodeAtTail(new SinglyLinkedListNode(9), 9);
        final SinglyLinkedListNode node2 = tail.insertNodeAtTail(new SinglyLinkedListNode(10), 10);
        final SinglyLinkedListNode node3 = tail.insertNodeAtTail(null, 11);

        node1.next = node2;
        node2.next = node3;

        SinglyLinkedListNode n = node1;
        while (n != null) {
            System.out.println(n.data);
            n = n.next;
        }
    }

    private SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, final int data) {
        if (head == null) {
            head = new SinglyLinkedListNode(data);
        } else {
            SinglyLinkedListNode node = head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = new SinglyLinkedListNode(data);
        }


        return head;
    }


}

class SinglyLinkedListNode {
    int data;
    SinglyLinkedListNode next;

    public SinglyLinkedListNode(final int data) {
        this.data = data;
    }
}