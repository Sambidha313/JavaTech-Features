package co.java.listinterface;

public class Linkedlist {

	Node head;// First node or called as head node

	// Insert Method
	public void insert(int data) {
		// Before using insert method first we will create a node

		Node node = new Node();
		// Value which the user passes i.e 5,say this is your first node

		node.data = data;
		node.next = null;
		// But remember if there will be list with you then this data will be added at
		// the end.
		// Suppose you dont have the list and this is your first node,check

		if (head == null) {
			head = node;
		}

		// if you are having nodes
		else {
			Node n = head;
		}
		// What if i want to insert node say 18 in between,but this is getting added at
		// the end.
		// But how to know which is the last value,we have to start from initial point
		// and go till we get a null

		while (node.next != null)
		// Here 'n' is the temporary variable which will point to head and check whether
		// there is null value so the head node will be having the address of 2nd node.

		{
			node = node.next;// For jumping to the next node
		}
		node.next = node; // This is for pointing to the new node
	}

	public void show() {
		// You will travel around to print the value of nodes.

		Node node = head;
		while (node.next != null) {
			System.out.println(node.data);
			// Shift to next node
			node = node.next;
		}
	}

}
