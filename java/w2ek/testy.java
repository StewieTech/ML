package Data_Analysis.java.w2ek;

import java.util.List;
import java.util.ArrayList;

public class testy {
    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<>(50);
        root.setLeft(new TreeNode<>(25));
        root.getLeft().setLeft(new TreeNode<>(10));
        root.setRight(new TreeNode<>(100));
        root.getRight().setLeft(new TreeNode<>(75));
        root.getRight().setRight(new TreeNode<>(125));
        root.getRight().getRight().setLeft(new TreeNode<>(110));
    
        Traversals<Integer> traversals = new Traversals<>();
        List<Integer> preOrder = traversals.preorder(root);
        System.out.println(preOrder);
    }
       
}
