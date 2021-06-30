package za.ac.cput.queues;

import za.ac.cput.linkedlist.EmptyListException;
import za.ac.cput.linkedlist.List;

/**
 *
 * @author    Chadrack B. Boudzoumou
 * @email     219383847@mycput.ac.za
 * @student   219383847
 * @uni       Cape Peninsula University Of Technology
 * @since     30 Jun 2021 | 20:18:10
 */
public class Queue<T> {
    
    private List<T> queueList;
    
    public Queue() {
        queueList = new List<T>("queue");
    }
    
    public void enqueue(T object) {
        queueList.insertAtBack(object);
    }
    
    public T dequeue() throws EmptyListException {
        return queueList.removeFromFront();
    }
    
    public boolean isEmpty() {
        return queueList.isEmpty();
    }
    
    public void print() {
        queueList.print();
    }
        
}