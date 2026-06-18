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
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        Deque<TreeNode> dq = new ArrayDeque<>();
        int depth = 0;
        dq.offer(root);
        while (!dq.isEmpty()) {
            depth++;
            int size = dq.size();
            for (int i = 0; i < size; i++) {
                TreeNode temp = dq.poll();
                if (temp.left != null)
                    dq.offer(temp.left);
                if (temp.right != null)
                    dq.offer(temp.right);
            }
        }
        return depth;
    }
}