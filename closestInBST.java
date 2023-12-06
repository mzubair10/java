class Program {
    // public static int findClosestValueInBst(BST tree, int target) {
    // int diffValue = Integer.MAX_VALUE;
    // int treeNodeValue = Integer.MAX_VALUE;
    // while (tree != null) {
    // if (tree.value == target) {
    // return tree.value;
    // }
    // if (diffValue > Math.abs(tree.value - target)) {
    // diffValue = Math.abs(tree.value - target);
    // treeNodeValue = tree.value;
    // }
    // if (tree.value < target) {
    // tree = tree.right;
    // } else {
    // tree = tree.left;
    // }
    // }
    // return treeNodeValue;
    // }
    public static int findClosestValueInBst(BST tree, int target) {
        return findClosestValueWithRecursion(tree, target, tree.value);
    }

    static int findClosestValueWithRecursion(BST tree, int target, int minDistance) {
        if (tree != null) {
            if (tree.value == target) {
                return tree.value;
            }
            if (Math.abs(tree.value - target) < Math.abs(minDistance - target)) {
                minDistance = tree.value;
            }
            if (tree.value > target) {
                minDistance = findClosestValueWithRecursion(tree.left, target, minDistance);
            } else {
                minDistance = findClosestValueWithRecursion(tree.right, target, minDistance);
            }
        }
        return minDistance;
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        BST tree = new BST(10);
        tree.left = new BST(5);
        tree.right = new BST(15);
        // left child nodes
        tree.left.left = new BST(2);
        tree.left.right = new BST(5);
        tree.left.left.left = new BST(1);
        // right child nodes
        tree.right.left = new BST(13);
        tree.right.right = new BST(22);
        tree.right.left.right = new BST(14);
        System.out.println(findClosestValueInBst(tree, 12));
    }
}
