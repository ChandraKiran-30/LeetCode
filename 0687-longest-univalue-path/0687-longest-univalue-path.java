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

    static int ans;

    public int solve(TreeNode root) {
        if (root == null)
            return 0;
        int path = 0, x = 1;
        int left = solve(root.left);
        int right = solve(root.right);
        if (root.left != null && root.left.val == root.val) {
            path += left;
            x = Math.max(x, left + 1);
        }
        if (root.right != null && root.right.val == root.val) {
            path += right;
            x = Math.max(x, right + 1);
        }
        ans = Math.max(ans, path);
        return x;
    }

    public int longestUnivaluePath(TreeNode root) {
        ans = 0;
        solve(root);
        return ans;
    }
}