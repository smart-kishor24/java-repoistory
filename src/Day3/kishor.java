/*package Day3;

public class kishor {
	private int[] stack;
	private int top;
	private int capacity;
	kishor(int capacity) {
		this.capacity = capacity;
		stack = new int[capacity];
		top = -1;
	}
	void push(int value) {
		if (top == capacity - 1) {
			System.out.println("Stack overflow");
			return;
		}
		stack[++top] = value;
	}
	int pop() {
		if (isEmpty()) {
			System.out.println("Stack underflow");
			return - 1;
		}
		return stack[top--];
	}
	int peek() {
	    if (isEmpty()) {
	        System.out.println("Stack is empty");
	        return -1;
	    }
	    return stack[top];
	}
	boolean isEmpty() {
		return top == -1;
	}
	void display() {
		for (int i = top; i >=0; i--) {
			System.out.println(stack[i] + "  ");
		}
		System.out.println();
	}
	public static void main (String[] args) {
		kishor stack = new kishor(5);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.display();
		System.out.println("Top: " + stack.peek());
		System.out.println("popped: " + stack.pop());
		stack.display();	
	}

}
package Day3;
class kishor {
	static class Node {
		int data;
		Node next;
		Node(int data) {
			this .data = data;
		}
	}
	private Node top;
	void push(int value) {
		Node newNode = new Node(value);
		newNode.next = top;
		top = newNode;
	}
	int pop() {
		if (top == null) {
			System.out.println("Stack Underflow");
			return -1;
			
		}
		int value = top.data;
		top = top.next;
		return value;
		
	}
	int peek() {
		if (top == null) {
			return -1;
		}	
		return top.data;
		
	}
	boolean isEmpty() {
		return top == null;
		
	}
	public static void main(String[] args) {
		kishor stack = new kishor();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
	}
}

package Day3;
import java.util.Stack;

public class kishor {
    static String reverse(String str) {
        Stack<Character> stack = new Stack<>();

        // Push each character onto the stack
        for (char ch : str.toCharArray()) {
            stack.push(ch);
        }

        // Pop each character to build the reversed string
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "kishor";
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reverse(input));
    }
}

package Day3;
import java.util.Stack;
public class kishor {
	static boolean isBalanced(String str) {
		Stack<Character> stack = new Stack<>();
		for(char ch : str.toCharArray()) {
			if(ch == '(' || ch =='[' || ch == '{') {
				stack.push(ch);
				
			}
			else if(ch == ')' || ch == ']' || ch == '}') {
				if(stack.isEmpty()) {
					return false;
				}
				char top = stack.pop();
				if(ch == ')' && top != '(') {
					return false;
				}
				if(ch == ']' && top != '[') {
					return false;
				}
				if(ch == '}' && top != '{') {
					return false;
				}
			
			}
		}
		return stack.isEmpty();
	}
		public static void main(String[] args) {
			System.out.println(isBalanced("{[()]}"));
			System.out.println(isBalanced("{[(])}"));
			
		}
	}

package Day3;

import java.util.Stack;

public class kishor{
    static int evaluate(String expression) {
        Stack<Integer> stack = new Stack<>();
        String[] tokens = expression.split(" ");
        
        for (String token : tokens) {
            if (token.matches("\\d+")) {
                stack.push(Integer.parseInt(token));
            } else {
                int b = stack.pop();
                int a = stack.pop();
                
                switch (token) {
                    case "+":
                        stack.push(a + b);
                        break;
                    case "-":
                        stack.push(a - b);
                        break;
                    case "*":
                        stack.push(a * b);
                        break;
                    case "/":
                        stack.push(a / b);
                        break;
                }
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String expression = "2 3 + 4 *"; 
        
        System.out.println(evaluate(expression));
    }
}

package Day3;

public class kishor {
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;
    public kishor(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }
    public void enqueue(int value) {
        if (size == capacity) {
            System.out.println("Queue Overflow!");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = value;
        size++;
    }
    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue Underflow!");
            return -1;
        }
        int value = queue[front];
        front = (front + 1) % capacity;
        size--;
        return value;
    }
    public static void main(String[] args) {
        kishor q = new kishor(5);
        q.enqueue(10);
        q.enqueue(20);
        System.out.println(q.dequeue()); 
        System.out.println(q.dequeue()); 
    }
}*/
package Day3;

public class kishor {
	 private int[] queue;
	    private int front;
	    private int rear;
	    private int size;
	    kishor(int capacity) {
	        queue = new int[capacity];
	        
	        front = 0;
	        rear = -1;
	        size = 0;
	    }
	     void enqueue(int value) {
	            if (size == queue.length) {
	                System.out.println("Queue Full"); 
	                return;
}
	            rear = (rear + 1) % queue.length;
	            queue[rear] =value;
	            size++;
	     }
	     int dequeue() {
	    	 if(size == 0) {
	    		 return -1;
	    	 }
	    	 int value = queue[front];
	    	 front = (front + 1) % queue.length;
	    	 size--;
	    	 return value;
	     }
	     public static void main(String[] args) {
	    	 kishor q = new kishor(3);
	    	 q.enqueue(10);
	         q.enqueue(20);
	         q.enqueue(30);
	         System.out.println(q.dequeue()); 
	         q.enqueue(40);
	         System.out.println(q.dequeue()); 
	         System.out.println(q.dequeue()); 
	         System.out.println(q.dequeue()); 
	     }
	     }