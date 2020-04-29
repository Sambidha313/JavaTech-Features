package co.java.queue;

public class QueueMain {

	public static void main(String[] args) {

		Queue q = new Queue();
		q.enQueue(5);
		q.enQueue(4);
		q.enQueue(3);
		q.enQueue(2);
		q.enQueue(1);
		
		q.deQueue();
		q.deQueue();
		
		
		q.show();

	}

}


//Main method for creating object and calling the methods defined in the Queue