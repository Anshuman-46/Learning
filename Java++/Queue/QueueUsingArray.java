public class QueueUsingArray {

	private int [] data;
	private int front; // index at which front/first element  is stored
	private int rear; // index at which rear/end element  is stored
	private int size;
	
	public QueueUsingArray () {
		data = new int [10];
		front = -1; // starting : initially nothing as if it is zero it means it have element at index = 0;
		rear = -1; // end index : initially nothing 
		size = 0;
	}
	
	public QueueUsingArray (int capacity) {
		data = new int [capacity];
		front = -1; // starting
		rear = -1;
		size = 0;
	}
	
	int size () {
		return size;
	}
	
	boolean isEmpty() {
		return (size() == 0); // size == 0 can also done
	}

//	to see first element
	int front() throws QueueEmptyException {
		if(size() == 0) {
			throw new QueueEmptyException (); 
		}
		return data[front];  
	}
	
//	best way to know is just dry run it		
	
	void enqueue (int elem) throws QueueFullException{
		if(size() == data.length) {
			doubleCapacity();
		}
			
		if(size() == 0) // initially front = -1
			front = 0; // or front++;
		
		size++;
//		rear = (rear + 1) % data.length;
		
//		above or below
		
		rear++;  // now it become circular queue
		if(rear == data.length) {
			rear = 0;
		}
		
//		rear++; // put element at next index
		data[rear] = elem;
	}
	
//	best way to know is just dry run it	
	
	int dequeue() throws QueueEmptyException{
		if(size() == 0) {
			throw new QueueEmptyException (); 
		}
		
		int temp = data[front]; // storing front
		
//		front = (front + 1) % data.length;

//		above or below

		front++; // move front
		if(front == data.length) {
			front = 0;
		}
		
		size--; // decrease size
		
		if(size == 0) {
			front = -1;
			rear = -1;
		}
		
		return temp;
	}
	
	private void doubleCapacity() {
		int temp [] = data;
		data = new int [2 * temp.length];
		int index = 0;
//		inserting first element at first
		for(int i = front; i < temp.length; i++) {
			data[index] = temp[i];
			index++;
		}
//		inserting last element at last
		for(int i = 0; i <= front - 1; i++) {
			data[index] = temp[i];
			index++;
		}
//		at end
		front = 0;
		rear = temp.length - 1;
	}
}
