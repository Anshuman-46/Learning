import java.util.LinkedList;
import java.util.Queue;

public class QueueCollection {

	public static void main(String[] args) {
		
		Queue <Integer> queue =new LinkedList <> ();
		queue.add(1); // enqueue
		queue.add(2);
		System.out.println(queue.poll()); // dequeue
		System.out.println(queue.size()); // size
		System.out.println(queue.peek()); // front
		System.out.println(queue.isEmpty()); // isEmpty
		
	}
}
