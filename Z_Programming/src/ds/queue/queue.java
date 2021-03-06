package ds.queue;

public class queue {

	private int maxsize;
	private long[] queueArray;
	private int rear;
	private int front;
	private int noOfItems;

	public queue(int size) {
		this.maxsize = size;
		this.queueArray = new long[size];
		front = 0;
		rear = -1;
		noOfItems = 0;
	}
	// Queue learning from Imtiaz
	public void insert(long j) {
		if (isFull()) {
			// rear = -1;
			System.out.println("Queue is full");
		} else {
			rear++;
			queueArray[rear] = j;
			noOfItems++;
		}
	}

	public long remove() {
		long temp = queueArray[front];
		front++;
		if (front == maxsize) {
			front = 0;
		}
		noOfItems--;
		return temp;
	}

	public long peek() {
		return queueArray[front];
	}

	public boolean isEmpty() {
		return (noOfItems == 0);
	}

	public boolean isFull() {
		return (noOfItems == maxsize);
	}

	public void view() {
		System.out.println("[");
		for (int i = 0; i < queueArray.length; i++) {
			System.out.print(queueArray[i] + " ");
		}
		System.out.println("]");

	}

}
