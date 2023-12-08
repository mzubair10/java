public class expressionTree {
    static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        public BinaryTree(Integer value) {
            this.value = value;
        }
    }

    static int evaluateExpressionTree(BinaryTree node) {
        if (node.left == null && node.right == null) {
            return node.value;
        }
        int left = evaluateExpressionTree(node.left);
        int right = evaluateExpressionTree(node.right);
        if (node.value == -1) {
            return left + right;
        } else if (node.value == -2) {
            return left - right;
        } else if (node.value == -3) {
            return (int) (left / right);
        } else if (node.value == -4) {
            return left * right;
        }
        return 0;
    }

    public static void main(String[] args) {
        BinaryTree btree = new BinaryTree(-1);
        btree.left = new BinaryTree(-2);
        btree.left.left = new BinaryTree(-4);
        btree.left.right = new BinaryTree(2);
        btree.left.left.left = new BinaryTree(2);
        btree.left.left.right = new BinaryTree(3);

        btree.right = new BinaryTree(-3);
        btree.right.left = new BinaryTree(8);
        btree.right.right = new BinaryTree(3);
        System.out.println(evaluateExpressionTree(btree));
    }

}
