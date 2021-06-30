package za.ac.cput.linkedlist;

/**
 *
 * @author    Chadrack B. Boudzoumou
 * @email     219383847@mycput.ac.za
 * @student   219383847
 * @uni       Cape Peninsula University Of Technology
 * @since     28 Jun 2021 | 19:30:35
 */
public class EmptyListException extends RuntimeException {
    
    public EmptyListException() {
        this("list");
    }
    
    public EmptyListException(String name) {
        super(name + "is empty");
    }
    
}