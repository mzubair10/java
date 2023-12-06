import java.util.*;

public class branchSumSelf {
    public static class BinaryTree {
        int value;
        BinaryTree leftNode;
        BinaryTree rightNode;

        public BinaryTree(Integer value) {
            this.value = value;
        }

    }

    public static List<Integer> branchSum(BinaryTree node) {
        ArrayList<Integer> resultSet = new ArrayList<Integer>();
        branchSumWithRecursion(node, 0, resultSet);
        return resultSet;
    }

    public static void branchSumWithRecursion(BinaryTree node, int sum, List<Integer> finalResultSet) {
        if (node == null) {
            return;
        }
        if (node.leftNode == null && node.rightNode == null) {
            sum = sum + node.value;
            finalResultSet.add(sum);
            return;
        }
        branchSumWithRecursion(node.leftNode, sum + node.value, finalResultSet);
        branchSumWithRecursion(node.rightNode, sum + node.value, finalResultSet);
    }

    public static void main(String[] args) {
        BinaryTree node = new BinaryTree(1);
        // left node
        node.leftNode = new BinaryTree(2);
        node.leftNode.leftNode = new BinaryTree(4);
        node.leftNode.rightNode = new BinaryTree(5);
        node.leftNode.leftNode.leftNode = new BinaryTree(8);
        node.leftNode.leftNode.rightNode = new BinaryTree(9);
        node.leftNode.rightNode.leftNode = new BinaryTree(10);

        // right node
        node.rightNode = new BinaryTree(3);
        node.rightNode.leftNode = new BinaryTree(6);
        node.rightNode.rightNode = new BinaryTree(7);
        System.out.println(branchSum(node));
    }
}
