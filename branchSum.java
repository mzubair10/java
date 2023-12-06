import java.util.*;

public class branchSum {
    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public static List<Integer> branchSums(BinaryTree root) {
        List<Integer> resultSet = new ArrayList<Integer>();
        branchSumsRecursive(root, 0, resultSet);
        return resultSet;
    }

    public static void branchSumsRecursive(BinaryTree node, int sum, List<Integer> returnList) {
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) {
            returnList.add(node.value + sum);
            return;
        }
        branchSumsRecursive(node.left, sum + node.value, returnList);
        branchSumsRecursive(node.right, sum + node.value, returnList);
    }

    public static void main(String[] args) {
        BinaryTree btree = new BinaryTree(1);
        // left subnodes
        btree.left = new BinaryTree(2);
        btree.left.left = new BinaryTree(4);
        btree.left.right = new BinaryTree(5);
        btree.left.left.left = new BinaryTree(8);
        btree.left.left.right = new BinaryTree(9);
        btree.left.right.left = new BinaryTree(10);
        // right subnodes
        btree.right = new BinaryTree(3);
        btree.right.left = new BinaryTree(6);
        btree.right.right = new BinaryTree(7);
        List<Integer> outputList = branchSums(btree);
        System.out.println(outputList);
    }
}
