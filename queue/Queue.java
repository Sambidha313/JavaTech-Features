package co.java.queue;

public class Queue {

	int queue[] = new int[5]; // Creating a queue with size 5
	int size;
	int front; // Front and rear are major things in a queue,front is where u remove element
	int rear; // Rear is where u add elements

	public void enQueue(int data) {
		queue[rear] = data; // basically adding say 5
		rear = rear + 1; // shifting to the next
		size = size + 1;
	}

	public int deQueue() {
		int data = queue[front]; // removing element we are using dequeue(front)
		front = front + 1;
		size = size - 1;
		return data;
	}

	public void show() {
		for (int i = 0; i < size; i++) {
			System.out.println(queue[i] + " ");
			System.out.println(queue[front + i] + " ");
		}
	}
}
