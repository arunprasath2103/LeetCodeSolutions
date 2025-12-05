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
class Solution {
    public static List<Integer> inorderTraversal(TreeNode root) {
        if(root == null) return new ArrayList<>();

        List<Integer> nodes = new ArrayList<>();
        bfsInorder(root, nodes);
        return nodes;
    }

    public static void bfsInorder(TreeNode root, List<Integer> nodes) {
        if(root == null) return;

        bfsInorder(root.left, nodes);
        nodes.add(root.val);
        bfsInorder(root.right, nodes);
    }
}