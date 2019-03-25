package queue;

public class App {

  public static void main(String[] args) {
    Queue<Integer> q = new Queue<>();

    q.enqueue(10);
    q.enqueue(20);
    q.enqueue(30);

    System.out.println("The size is: " + q.size());
    System.out.println(q.deque());
    System.out.println(q.deque());
    System.out.println(q.deque());
    System.out.println("The size is: " + q.size());
  }
}
