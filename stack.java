public class stack {

    // Define the Node class as an inner class of Stack
    private class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Define the top pointer for the stack
    private int size;
    private Node top;

    // Define a method to push a new element onto the stack
    public void push(int data) {
        Node newNode = new Node(data);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

    // Define a method to pop the top element from the stack
    public int pop() {
        if (top == null) {
            throw new IllegalStateException("Stack is empty");
        } else {
            int data = top.data;
            top = top.next;
            return data;
        }
    }

    // Define a method to peek at the top element of the stack without removing it
    public int peek() {
        if (top == null) {
            throw new IllegalStateException("Stack is empty");
        } else {
            return top.data;
        }
    }

    // Define a method to check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }
    public int size()
    { 
        return size;
    }

    // Example usage
    public static void main(String[] args) {
        stack myStack = new stack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        System.out.println("Top element: " + myStack.peek()); // Output: 3
        while (!myStack.isEmpty()) {
            System.out.println(myStack.pop()); // Output: 3 2 1
        }
    }
}
