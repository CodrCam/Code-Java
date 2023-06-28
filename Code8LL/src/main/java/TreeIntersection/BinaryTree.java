package TreeIntersection;


import java.util.function.Consumer;

public class BinaryTree {
    TreeNode root;

    public BinaryTree(TreeNode root) {
        this.root = root;
    }

    // Traverse the tree in order, execute the function on each node
    public void inOrderTraversal(TreeNode node, Consumer<TreeNode> func) {
        if (node != null) {
            inOrderTraversal(node.left, func);
            func.accept(node);
            inOrderTraversal(node.right, func);
        }
    }
}