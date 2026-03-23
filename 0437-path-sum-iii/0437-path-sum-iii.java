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

    static int cnt = 0;
    static HashMap<Long, Integer> hm;

    public void solve(TreeNode root, long sum, int k) {
        if (root == null)
            return;
        sum += root.val;
        if (sum == k)
            cnt++;
        cnt += hm.getOrDefault(sum - k, 0);
        hm.put(sum, hm.getOrDefault(sum, 0) + 1);
        solve(root.left, sum, k);
        solve(root.right, sum, k);
        hm.put(sum, hm.get(sum) - 1);
        if (hm.get(sum) == 0)
            hm.remove(sum);
    }

    public int pathSum(TreeNode root, int targetSum) {
        cnt = 0;
        hm = new HashMap<>();
        solve(root, 0, targetSum);
        return cnt;
    }
}