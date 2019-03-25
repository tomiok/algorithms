package stack;

public class Stack<T extends Comparable<T>> {

  private Node<T> node;

  private int count;

  private boolean isEmpty() {
    return this.node == null;
  }

  
}
