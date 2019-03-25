package queue;

public class Queue<T extends Comparable<T>> {

  private Node<T> firstNode;

  private Node<T> lastNode;

  private int count;

  public void enqueue(T data) {
    count++;

    Node<T> temp = lastNode;
    lastNode = new Node<>(data);
    lastNode.setNext(null);

    if (this.isEmpty()) {
      firstNode = lastNode;
    } else {
      temp.setNext(lastNode);
    }
  }

  public boolean isEmpty() {
    return this.firstNode == null;
  }

  public int size() {
    return this.count;
  }

  public T deque() {
    count--;
    T toDeque = this.firstNode.getData();
    this.firstNode = this.firstNode.getNext();
    return toDeque;
  }

}
