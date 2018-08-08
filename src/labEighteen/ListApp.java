package labEighteen;


public class ListApp {

	public static void main(String[] args) {
		MyList list = new MyLinkedList();
	//	MyList list = new MyArrayList();
		
		list.addAtBeginning("A");
		list.addAtBeginning("C");
		list.addAtBeginning("E");
		list.addAtBeginning("F");
		list.addAtBeginning("G");
		list.addAtBeginning("I");
	
		
		
		list.insertAt(1, "B");
		list.insertAt(3, "D");
		list.insertAt(8, "H");
		
	
		
		list.removeAt(5);
		list.removeAt(0); 
		list.removeAt(2); 
		
		
		System.out.println(list);
		
	}

	
}
