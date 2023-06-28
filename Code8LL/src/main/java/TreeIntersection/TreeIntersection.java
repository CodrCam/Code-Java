package TreeIntersection;

import Code30.Hashtable;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class TreeIntersection {

    public Set<Integer> intersection(BinaryTree tree1, BinaryTree tree2) {
        Hashtable hashtable = new Hashtable();
        Set<Integer> intersection = new HashSet<>();

        Consumer<TreeNode> addNodeToHashtable = node -> hashtable.set(String.valueOf(node.value), "");
        tree1.inOrderTraversal(tree1.root, addNodeToHashtable);

        Consumer<TreeNode> checkNodeInHashtable = node -> {
            if (hashtable.has(String.valueOf(node.value))) {
                intersection.add(node.value);
            }
        };
        tree2.inOrderTraversal(tree2.root, checkNodeInHashtable);

        return intersection;
    }
}
