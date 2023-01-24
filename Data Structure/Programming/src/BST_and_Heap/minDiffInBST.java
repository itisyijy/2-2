package BST_and_Heap;

class minDiffInBST {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    TreeNode last;
    int minDiff;

    public int minDiffInBST(TreeNode root) {
        minDiff = Integer.MAX_VALUE;
        inorder(root);
        return minDiff;
    }

    private void inorder(TreeNode node){
        if(node == null)
            return;
        inorder(node.left);
        if(last != null){
            int diff = Math.abs(last.val - node.val);
            minDiff = Math.min(minDiff, diff);
        }
        last = node;
        inorder(node.right);
    }
}