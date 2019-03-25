package stack;

public class Stack<T extends Comparable<T>> {

  private Node<T> node;

  private int count;

  public void push(T data) {
    count++;

    if (isEmpty()) {
      this.node = new Node<>(data);
    } else {
      Node<T> n = new Node<>(data);
      n.setNext(node);
      node = n;
    }
  }

  public T pop() {
    if (isEmpty()) {
      throw new RuntimeException("The stack is empty!");
    }
    count--;

    Node<T> toPop = node;
    node = toPop.getNext();
    return toPop.getData();
  }

  public boolean isEmpty() {
    return this.node == null;
  }

  public int size() {
    return this.count;
  }
}
