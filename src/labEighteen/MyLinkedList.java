package labEighteen;



public class MyLinkedList implements MyList {

	// head is the first node in the list. if null, the list is empty.
	private Node head = null;
	// for convenience, keep track of how many items are in the list
	private int length = 0;
	
	@Override
	public void addAtBeginning(String data) {
		// add a new node and set it as the new head
		head = new Node(data, head);
		length++;
	}
	
	@Override
	public void removeFromBeginning() {
		// find the second node and set it as the new head
		head = head.getNext();
		length--;
	}
	
	@Override
	public void addAtEnd(String data) {//afterTail can also be oldTail
		Node node = new Node(data, null);//give current node data, and next node is null
		Node afterTail = getNodeAt(length - 1);//take what used to be last node and point 2 new node (if its 0 based list it will ALWAYS be length - 1)
		afterTail.setNext(node);//
		length++;
				}
	
	@Override   
	public void removeFromEnd() {
		if (length < 2) {
			// The beginning is the end.
			removeFromBeginning();
		} else {
			// find the node right before the end.
			Node beforeTail = getNodeAt(length - 2);//or Node newTail = getNodeAt(length - 2);
			// set its next to null. This ends the list here.
			beforeTail.setNext(null);//or newTail.setNext(null); if using above ^^
			length--;
		}
	}
	
	@Override
	public String get(int index) {
		return getNodeAt(index).getData();
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		// start at the head
		Node node = head;
		// follow the links between nodes until it reaches the end 
		while (node != null) {
			sb.append(node.toString());
			node = node.getNext();
		}
		return sb.toString();
	}
	
	@Override
	public int size() {
		return length;
	}
	
	private Node getNodeAt(int index) {
		// start at the head
		Node node = head;
		// follow the links between nodes until it counts off the right number
		for (int i = 0; i < index; i++) {
			if (node == null) {
				// In case we run out of nodes before we get up to the desired index, return null
				return null;
			}
			node = node.getNext();
		}
		return node;
	}

	@Override
	public void removeAt(int index) {
		Node node = head;
		for (int i = 0; i < index -1; i++) {
			node = node.getNext();
		}
		node.setNext(node.getNext().getNext());
		length --;
	}

	@Override
	public void insertAt(int index, String data) {
		Node node = head;
		for (int i = 0; i < index + 1; i++);
	node = new Node(data, getNodeAt(index));
	getNodeAt(index - 1).setNext(node);
	length++;
	}

	
}
