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
    int preIndex = 0;
    int inIndex = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return dfs(preorder, inorder, Integer.MAX_VALUE);
    }

    public TreeNode dfs(int[] preorder, int[] inorder, int limit){
        if(preIndex >= preorder.length) return null;
        if(inorder[inIndex] == limit){
            inIndex++;
            return null;
        }
        TreeNode node = new TreeNode(preorder[preIndex++]);
        node.left = dfs(preorder, inorder, node.val);
        node.right = dfs(preorder, inorder, limit);
        return node;
    }
}
