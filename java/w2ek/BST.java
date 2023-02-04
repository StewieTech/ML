package Data_Analysis.java.w2ek;

public class BST {
    import java.util.NoSuchElementException;

/**
 * Your implementation of a BST.
 */
public class BST<T extends Comparable<? super T>> {

    /*
     * Do not add new instance variables or modify existing ones.
     */
    private BSTNode<T> root;
    private int size;

    /*
     * Do not add a constructor.
     */

     /**
     * Returns the data from the tree matching the given parameter.
     *
     * This should be done recursively.
     *
     * Do not return the same data that was passed in. Return the data that
     * was stored in the tree.
     *
     * Hint: Should you use value equality or reference equality?
     *
     * Must be O(log n) for best and average cases and O(n) for worst case.
     *
     * @param data The data to search for. You may assume data is never null.
     * @return The data in the tree equal to the parameter.
     * @throws java.util.NoSuchElementException If the data is not in the tree.
     */
    public T get(T data) {
        return get(data, root);
    }
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        private T get(T data, BSTNode<T> node) {
            
        if (node == null) {
            throw new NoSuchElementException("It's null baby!");
        } else if (data.compareTo(node.getData()) < 0) {
            return get(data, node.getLeft());
        } else if (data.compareTo(node.getData()) > 0) {
            return get(data, node.getRight());
        } else {
            return node.getData();
        }
            }
        
        
    

    /**
     * Removes and returns the data from the tree matching the given parameter.
     *
     * This must be done recursively.
     *
     * There are 3 cases to consider:
     * 1: The node containing the data is a leaf (no children). In this case,
     * simply remove it.
     * 2: The node containing the data has one child. In this case, simply
     * replace it with its child.
     * 3: The node containing the data has 2 children. Use the PREDECESSOR to
     * replace the data. You should use recursion to find and remove the
     * predecessor (you will likely need an additional helper method to
     * handle this case efficiently).
     *
     * Do NOT return the same data that was passed in. Return the data that
     * was stored in the tree.
     *
     * Hint: Should you use value equality or reference equality?
     *
     * Must be O(log n) for best and average cases and O(n) for worst case.
     *
     * @param data The data to remove. You may assume that data is never null.
     * @return The data that was removed.
     * @throws java.util.NoSuchElementException If the data is not in the tree.
     */
    public T remove(T data) {
        BSTNode<T> dummyNode = new BSTNode<>(null);
        root = remove(data, root, dummyNode);
        size--;
        return dummyNode.getData();
    }

    /**
     * Recursive helper method for remove.
     */
    private BSTNode<T> remove(T data, BSTNode<T> node, BSTNode<T> dummyNode) {
        if (node == null) {
            throw new NoSuchElementException("Element not found in the tree");
        } else if (data.compareTo(node.getData()) < 0) {
            node.setLeft(remove(data, node.getLeft(), dummyNode));
            return node;
        } else if (data.compareTo(node.getData()) > 0) {
            node.setRight(remove(data, node.getRight(), dummyNode));
            return node;
        } else {
            dummyNode.setData(node.getData());
            if (node.getLeft() == null) {
                return node.getRight();
            } else if (node.getRight() == null) {
                return node.getLeft();
            } else {
                BSTNode<T> temp = node.getLeft();
                while (temp.getRight() != null) {
                    temp = temp.getRight();
                }
                node.setData(temp.getData());
                node.setLeft(remove(temp.getData(), node.getLeft(), dummyNode));
                return node;
            }
        }
    }



    /**
     * Returns the root of the tree.
     *
     * For grading purposes only. You shouldn't need to use this method since
     * you have direct access to the variable.
     *
     * @return The root of the tree
     */
    public BSTNode<T> getRoot() {
        // DO NOT MODIFY THIS METHOD!
        return root;
    }

    /**
     * Returns the size of the tree.
     *
     * For grading purposes only. You shouldn't need to use this method since
     * you have direct access to the variable.
     *
     * @return The size of the tree
     */
    public int size() {
        // DO NOT MODIFY THIS METHOD!
        return size;
    }
}
}
