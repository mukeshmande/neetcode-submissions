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

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        List<String> list = new ArrayList<>();
        dfs(root, list);
        return String.join(",", list);
    }

    public void dfs(TreeNode root, List<String> list){
        if(root == null){
            list.add("N");
            return;
        }
        list.add(String.valueOf(root.val));
        dfs(root.left, list);
        dfs(root.right, list);

    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] str = data.split(",");
        int[] i = {0};
        return dfsD(str, i);
    }


    public TreeNode dfsD(String[] str, int[] i){
        if(str[i[0]].equals("N")){
            i[0]++;
            return null;
        }

        TreeNode node = new TreeNode(Integer.parseInt(str[i[0]]));
        i[0]++;
        node.left = dfsD(str, i);
        node.right = dfsD(str, i);
        return node;
    }
}
