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

    public int solve(TreeNode root, int max) {
        if (root == null)
            return 0;
        if (max <= root.val) {
            ans++;
        }
        solve(root.left, Math.max(max, root.val));
        solve(root.right, Math.max(max, root.val));
        return ans;
    }

    public int goodNodes(TreeNode root) {
        ans = 0;
        solve(root, root.val);
        return ans;
    }
}