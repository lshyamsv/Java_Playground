package ds.singlylinkedlist;

public class SinglyLinkedList {
	private Node first;

	public SinglyLinkedList() {

	}

	// return if FIRST IS EQUAL TO NULL. IT will return TRUE and no other link
	// is connected

	public boolean isEmpty() {
		return (first == null);
	}

	// used to insert at the beginning of the list

	public void insertFirst(int data) { // Integer data from the Node class
		Node newNode = new Node(); // creating a new node
		newNode.data = data; // passing the data
		newNode.next = first; // The new nodes next fields will point to old
								// first
		first = newNode; // first field to the new node

	}

	public Node deleteFirst() {
		Node temp = first; // Assing current first to "Temp"
		first = first.next; // Change whatever the variable points to first.
							// DELETED THE REFERENCE FOR THE FIRST NODE

		return temp;
	}

	public void diplayList() {
		System.out.println("List (First --> Last) ");
		Node current = first;
		while (current != null) {
			current.displayNode(); // change the current otherwise infinite loop
			current = current.next;

		}

		System.out.println();
	}

	public void insertLast(int data) {
		Node current = first;
		while (current.next != null) {
			current = current.next; // till the last node is null
		}

		Node newNode = new Node();
		newNode.data = data;
		current.next = newNode; //Current node is the new node

	}

}
