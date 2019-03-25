package stack;

public class Node<T extends Comparable<T>> {

  private T data;

  private Node<T> next;

  public Node(T data) {
    this.data = data;
  }

  public T getData() {
    return data;
  }

  public void setData(final T data) {
    this.data = data;
  }

  public Node<T> getNext() {
    return next;
  }

  public void setNext(final Node<T> next) {
    this.next = next;
  }
}
