public class nodeDepth {
    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public static int nodeDepthR(BinaryTree root, int depth) {
        if (root == null) {
            return 0;
        }
        return depth + nodeDepthR(root.left, depth + 1) + nodeDepthR(root.right, depth + 1);
    }

    public static int nodeDepths(BinaryTree root) {
        return nodeDepthR(root, 0);
    }

    public static void main(String[] args) {
        BinaryTree btree = new BinaryTree(1);
        // left nodes
        btree.left = new BinaryTree(2);
        btree.left.left = new BinaryTree(4);
        btree.left.right = new BinaryTree(5);
        btree.left.left.left = new BinaryTree(8);
        btree.left.left.right = new BinaryTree(9);
        // right nodes
        btree.right = new BinaryTree(3);
        btree.right.left = new BinaryTree(6);
        btree.right.right = new BinaryTree(7);
        System.out.println(nodeDepths(btree));
    }
}
