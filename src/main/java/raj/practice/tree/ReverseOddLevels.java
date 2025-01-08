package raj.practice.tree;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class ReverseOddLevels {

    class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode() {}
        TreeNode(int val) {
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    private void traverseTree(TreeNode left, TreeNode right, int level) {
        if (left == null) {
            return;
        }
        if (right == null) {
            return;
        }
        if (level %2 == 1) {
            int temp = left.val;
            left.val = right.val;
            right.val = temp;
        }
        traverseTree(left.left, right.right, level + 1);
        traverseTree(left.right, right.left, level + 1);
    }

    public TreeNode reverseOddLevels(TreeNode root) {

        TreeNode current = root;
        if (current == null) {
            return null;
        }
        traverseTree(root.left, root.right, 1);
        return root;
        
    }
}