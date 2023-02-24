public class Queue {

    // Define the Node class as an inner class of Queue
    private class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Define the front and rear pointers for the queue
    private int size;
    private Node front;
    private Node rear;

    // Define a method to add an element to the rear of the queue
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    // Define a method to remove and return the front element of the queue
    public int dequeue() {
        if (front == null) {
            throw new IllegalStateException("Queue is empty");
        } else {
            int data = front.data;
            front = front.next;
            if (front == null) {
                rear = null;
            }
            return data;
        }
    }

    // Define a method to peek at the front element of the queue without removing it
    public int peek() {
        if (front == null) {
            throw new IllegalStateException("Queue is empty");
        } else {
            return front.data;
        }
    }

    // Define a method to check if the queue is empty
    public boolean isEmpty() {
        return front == null;
    }

    public int size()
    {
        return size;
    }

    // Example usage
    public static void main(String[] args) {
        Queue myQueue = new Queue();
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        System.out.println("Front element: " + myQueue.peek()); // Output: 1
        while (!myQueue.isEmpty()) {
            System.out.println(myQueue.dequeue()); // Output: 1 2 3
        }
    }
}
