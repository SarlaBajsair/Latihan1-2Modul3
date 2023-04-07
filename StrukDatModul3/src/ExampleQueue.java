import java.util.LinkedList;

public class ExampleQueue {
    public static void main(String[] args) {
        java.util.Queue queue = new LinkedList();
        queue.add("Java");
        queue.add("DotNet");
        queue.offer("PHP");
        queue.offer("HTML");
        System.out.println(queue);
        System.out.println("Remove: " + queue.remove());
        System.out.println(queue);
        System.out.println("Element: " + queue.element());
        System.out.println(queue);
        System.out.println("Poll: " + queue.poll());
        System.out.println(queue);
        System.out.println("Peek: " + queue.peek());
        }
}