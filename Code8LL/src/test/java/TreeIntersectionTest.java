
import TreeIntersection.BinaryTree;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import TreeIntersection.TreeIntersection;
import TreeIntersection.TreeNode;

import java.util.Set;


import static org.junit.jupiter.api.Assertions.*;

class TreeIntersectionTest {
    private TreeIntersection treeIntersection;
    private BinaryTree tree1;
    private BinaryTree tree2;

    @BeforeEach
    void setUp() {
        treeIntersection = new TreeIntersection();

        // Create the first tree
        TreeNode root1 = new TreeNode(10);
        root1.left = new TreeNode(5);
        root1.right = new TreeNode(15);
        tree1 = new BinaryTree(root1);

        // Create the second tree
        TreeNode root2 = new TreeNode(10);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(15);
        tree2 = new BinaryTree(root2);
    }

    @Test
    void intersection() {
        Set<Integer> intersection = treeIntersection.intersection(tree1, tree2);
        assertTrue(intersection.contains(10));
        assertTrue(intersection.contains(15));
        assertFalse(intersection.contains(5));
        assertFalse(intersection.contains(2));
    }
}

