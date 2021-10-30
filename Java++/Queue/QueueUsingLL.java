public class QueueUsingLL<T> {

	int size;
	private Node<T> rear;
	private Node<T> front;

	public QueueUsingLL() {
		rear = null;
		front = null;
		size = 0;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return (size == 0);
	}

	public void enqueue(T data) {
		Node<T> newNode = new Node<>(data);
		if (front == null) /* no element have been inserted */ {
			front = newNode;
			rear = newNode;
			size++;
		} else {
			rear.next = newNode;
			rear = newNode;
			size++;
		}
	}

	public T dequeue() throws QueueEmptyException {
		if (size == 0) {
			QueueEmptyException e = new QueueEmptyException();
			throw e;
		}

		if (size == 1) {
			rear = null;
		}

		T tempData = front.data;
		front = front.next;
		size--;

		return tempData;
	}
}
