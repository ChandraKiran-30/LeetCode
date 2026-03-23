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

    static int max;

    int[] solve(TreeNode root) {
        if (root == null)
            return new int[]{0, 1, Integer.MAX_VALUE, Integer.MIN_VALUE};
        int[] left = solve(root.left);
        int[] right = solve(root.right);
        if (left[1] == 1 && right[1] == 1 &&
            left[3] < root.val && root.val < right[2]) {
            int sum = left[0] + right[0] + root.val;
            int mini = Math.min(root.val, left[2]);
            int maxi = Math.max(root.val, right[3]);
            max = Math.max(max, sum);
            return new int[]{sum, 1, mini, maxi};
        }
        return new int[]{0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE};
    }

    public int maxSumBST(TreeNode root) {
        max = 0;
        solve(root);
        return max;
    }
}