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
    public int maxPathSum(TreeNode root) {
        int[] maxsum = new int[1];
        maxsum[0] = root.val;
        dfs(root, maxsum);
        return maxsum[0];
    }


    public int dfs(TreeNode root, int[] maxsum){
        if(root == null) return 0;

        int left = Math.max(0, dfs(root.left, maxsum));
        int right = Math.max(0, dfs(root.right, maxsum));

        maxsum[0] = Math.max(maxsum[0], root.val + left + right);

        return root.val + Math.max(left, right);

    }
}
