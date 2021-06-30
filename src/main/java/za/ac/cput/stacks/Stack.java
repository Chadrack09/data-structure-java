package za.ac.cput.stacks;

import za.ac.cput.linkedlist.EmptyListException;
import za.ac.cput.linkedlist.List;

/**
 *
 * @author    Chadrack B. Boudzoumou
 * @email     219383847@mycput.ac.za
 * @student   219383847
 * @uni       Cape Peninsula University Of Technology
 * @since     30 Jun 2021 | 19:51:12
 * 
 * @param     <T> Self-referential object.
 */
public class Stack<T> extends List<T> {
    
    public Stack() {
        super("stack");
    }
    
    public void push(T object) {
        insertAtFront(object);
    }
    
    public T pop() throws EmptyListException {
        return removeFromFront();
    }
    
}