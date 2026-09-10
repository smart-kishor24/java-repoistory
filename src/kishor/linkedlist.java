/*package kishor;

public class linkedlist {
	static class Node {
		int data;
	    Node next;
	    Node(int data) {
	        this.data = data;
	        this.next = null;
	   }
	}
	Node head;
	
	void insertAtEnd(int data) {
	        Node newNode = new Node(data);
	        
	        if (head == null) {
	            head = newNode;
	            return;
	        }
	        Node current = head;
	        while (current.next != null) {
	            current = current.next; 
	        }
	        current.next = newNode;
	    }
	 
	 void display() {
		 Node current = head;
		 while (current != null) {
			 System.out.print(current.data + " -> ");
			 current = current.next; 
		 }
		 System.out.println("null");
	 }
	 	 public static void main(String[] args) {
		 linkedlist list = new linkedlist();
		 list.insertAtEnd(10);
		 list.insertAtEnd(20);
		 list.insertAtEnd(30);
		 list.insertAtEnd(40);
		 list.display();
	 }
}*/

package kishor;
class linkedlist {

   
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
       
        }
        
    }

    Node head = null;
    void insertAtBeginning(int data) {

    
        Node newNode = new Node(data);
        newNode.next = head;    
        head = newNode;
    }
    void insertAtEnd(int data) {

        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;

        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

  
    void display() {

        Node current = head;

        while (current != null) {
            System.out.print(current.data);

            if (current.next != null) {
                System.out.print(" -> ");
            }

            current = current.next;
        }

        System.out.println(" -> NULL");
    }

    public static void main(String[] args) {

        linkedlist list = new linkedlist();

       
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);

        System.out.println("Before insertion:");
        list.display();

       
        list.insertAtBeginning(5);

        System.out.println("After inserting 5 at the beginning:");
        list.display();
    }
}

