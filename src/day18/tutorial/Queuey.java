package day18.tutorial;

import java.util.LinkedList;

public class Queuey {
    // A queue's behavior is First In First Out
    // a Stack's behavior is Last In First Out

    LinkedList queue = new LinkedList();

    public Queuey () {
        queue = new LinkedList();
    }

    // Is our queue empty?
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // what is the size of the queue?
    public int size() {
        return queue.size();
    }

    public void enqueue( int n ) {
        queue.addLast(n);
    }

    public int dequeue() {
        return (int) queue.remove();
    }

    public int peek() {
        return (int) queue.get(0);
    }

    public static void main(String[] args) {
        Queuey intQueue = new Queuey();
        intQueue.enqueue(5);
        intQueue.enqueue(7);
        intQueue.enqueue(9);
        System.out.println("First out: " + intQueue.dequeue());
        System.out.println("Second out: " + intQueue.dequeue());
        System.out.println("Third out: " + intQueue.dequeue());
    }
}
