public class QueueUsingLL_Use {

	public static void main(String[] args) throws QueueEmptyException {

		QueueUsingLL<Integer> q = new QueueUsingLL<>();

		for (int i = 0; i < 5; i++)
			q.enqueue(i);

		while (!q.isEmpty()) {
			try {
				System.out.print(q.dequeue() + " ");
			} catch (QueueEmptyException e) {
				// unreachable code
			}
		}
		System.out.println("\n"+q.size());
		q.enqueue(7);
		System.out.println(q.size());
		q.dequeue();
		System.out.println(q.size());
		System.out.println(q.size());
		
	}
}
