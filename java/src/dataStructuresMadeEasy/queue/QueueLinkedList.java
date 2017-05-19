package queue;

public class QueueLinkedList {
	int data;
	QueueNode rear, front;
	int length = -1;

	public QueueLinkedList() {
		this.length = 0;
	}

	public static void main(String[] args) {
		QueueLinkedList queue = new QueueLinkedList();
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		queue.displayData();
		int data = queue.dequeue();
		System.out.println(data);
		queue.displayData();
	}

	private void enqueue(int i) {
		QueueNode node = new QueueNode(i);
		if (length == 0) {
			front = node;
			rear = node;
			length++;
		} else {
			rear.next = node;
			rear = node;
			length++;
		}

	}

	public int dequeue() {
		QueueNode temp = front;
		front = front.next;
		return temp.data;
	}

	public void displayData() {
		QueueNode current = this.front;
		while (current != null) {
			System.out.print(current.data);
			System.out.print(" ");
			current = current.next;
		}
	}

}

class QueueNode {
	int data;
	QueueNode next;

	public QueueNode(int data) {
		this.data = data;
		next = null;

	}

}
