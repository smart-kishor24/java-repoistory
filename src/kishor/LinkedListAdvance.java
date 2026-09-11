
package kishor;

class LinkedListAdvance {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head;

    // Insert at the beginning
    void insertFirst(int data) {
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    // Insert at the end
    void insertLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Reverse the linked list
    void reverse() {
        Node prev = null;
        Node current = head;

        while (current != null) {
            Node nextNode = current.next;

            current.next = prev;
            prev = current;
            current = nextNode;
        }

        head = prev;
    }

    // Find middle element
    int findMiddle() {
        if (head == null) {
            throw new RuntimeException("List is Empty");
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.data;
    }

    // Check whether linked list has a cycle
    boolean hasCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    // Display linked list
    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {

        LinkedListAdvance list = new LinkedListAdvance();

        list.insertLast(10);
        list.insertLast(20);
        list.insertLast(30);
        list.insertLast(40);
        list.insertLast(50);

        System.out.println("Original List:");
        list.display();

        System.out.println("Middle Element: " + list.findMiddle());

        System.out.println("Has Cycle: " + list.hasCycle());

        list.reverse();

        System.out.println("Reversed List:");
        list.display();
    }
}

