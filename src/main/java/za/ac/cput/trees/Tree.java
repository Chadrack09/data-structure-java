package za.ac.cput.trees;

/**
 *
 * @author    Chadrack B. Boudzoumou
 * @email     219383847@mycput.ac.za
 * @student   219383847
 * @uni       Cape Peninsula University Of Technology
 * @since     30 Jun 2021 | 22:09:38
 * 
 * <p>This class is an implementation of non-linear data structure
 * called trees. 
 */
public class Tree<T extends Comparable<T>> {

    private TreeNode<T> root;
    
    public Tree() {
        root = null;
    }
    
    public void insertNode(T insertValue) {
        
        if(root == null) {
            root = new TreeNode<T>(insertValue);
        }
        else {
            root.insert(insertValue);
        }
    }
    
    public void preorderTraversal() {
        preorderHelper(root);
    }
    
    private void preorderHelper(TreeNode node) {
        if(node == null) {
            return;
        }
        System.out.printf("%s ", node.data);
        preorderHelper(node.leftNode);
        preorderHelper(node.rightNode);
    }
    
    public void inorderTraversal() {
        inorderHelper(root);
    }
    
    private void inorderHelper(TreeNode<T> node) {
        if(node == null) {
            return;
        }
        inorderHelper(node.leftNode);
        System.out.printf("%s ", node.data);
        inorderHelper(node.rightNode);
    }
    
    public void postorderTraversal() {
        postorderHelper(root);
    }
    
    private void postorderHelper(TreeNode<T> node) {
        if(node == null) {
            return;
        }
        postorderHelper(node.leftNode);
        postorderHelper(node.leftNode);
        System.out.printf("%s ", node.data);
    }
    
}