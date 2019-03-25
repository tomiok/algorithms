package stack;

public class Stack<T extends Comparable<T>> {

  private Node<T> node;

  private int count;

  private void push(T data) {
    count++;

    if (isEmpty()) {
      this.node = new Node<>(data);
    } else {
      Node<T> n = new Node<>(data);
      n.setNext(node);
      node = n;
    }
  }

  private T pop() {
    count--;
    Node<T> toPop = node.getNext();
    node = toPop;
    return toPop.getData();
  }

  private boolean isEmpty() {
    return this.node == null;
  }

  private int size() {
    return this.count;
  }
}
