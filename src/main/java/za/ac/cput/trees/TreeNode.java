package za.ac.cput.trees;

/**
 *
 * @author    Chadrack B. Boudzoumou
 * @email     219383847@mycput.ac.za
 * @student   219383847
 * @uni       Cape Peninsula University Of Technology
 * @since     30 Jun 2021 | 22:12:51
 * 
 * <p>This class represent a Tree Node object.
 */
public class TreeNode<T extends Comparable<T>> {

    TreeNode<T> leftNode;
    TreeNode<T> rightNode;
    T data;
    
    public TreeNode(T nodeData) {
        data = nodeData;
        leftNode = rightNode = null;
    }
    
    public void insert(T insertValue) {
        
        if ( insertValue.compareTo(data) < 0 ) {
            if ( leftNode == null ) {
                leftNode = new TreeNode<T>(insertValue);
            }
            else {
                leftNode.insert(insertValue);
            }
        }
        
        else if ( insertValue.compareTo(data) > 0 ) {
            if(rightNode == null) {
                rightNode = new TreeNode<T>(insertValue);
            }
            else {
                rightNode.insert(insertValue);
            }
        }
    }
}