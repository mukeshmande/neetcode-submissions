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
    public int kthSmallest(TreeNode root, int k) {
        int[] tmp = new int[2];
        tmp[0] = k;
        inorderTraversal(root, tmp);
        return tmp[1];
    }

    public void inorderTraversal(TreeNode node, int[] tmp){
        if(node == null) return;
        inorderTraversal(node.left, tmp);
        tmp[0] -= 1;
        if(tmp[0] == 0){
            tmp[1] = node.val;
            return;
        }

        inorderTraversal(node.right, tmp);

    }
}
