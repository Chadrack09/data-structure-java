package za.ac.cput.linkedlist;

import java.util.LinkedList;

/**
 *
 * @author    Chadrack B. Boudzoumou
 * @email     219383847@mycput.ac.za
 * @student   219383847
 * @uni       Cape Peninsula University Of Technology
 * @since     28 Jun 2021 | 19:37:15
 */
public class ListTest {
    
    public static void main(String[] args) {
        
        List<Integer> list = new List<>();
        list.insertAtFront(-1);
        list.print();
        list.insertAtFront(0);
        list.print();
        list.insertAtBack(1);
        list.print();
        list.insertAtBack(5);
        list.print();
        
        try {
            
            int removedItem = list.removeFromFront();
            System.out.printf("%n%d removed%n", removedItem);
            list.print();
            
            removedItem = list.removeFromFront();
            System.out.printf("%n%d removed%n", removedItem);
            list.print();
            
            removedItem = list.removeFromBack();
            System.out.printf("%n%d removed%n", removedItem);
            list.print();
            
            removedItem = list.removeFromBack();
            System.out.printf("%n%d removed", removedItem);
            list.print();
            
        }
        catch(EmptyListException ex) {
            ex.printStackTrace();
        }
    }
    
}