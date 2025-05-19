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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        ArrayList<String> p1 = new ArrayList<>();
        ArrayList<String> q1 = new ArrayList<>();
        
        getTree(p, p1);
        getTree(q, q1);
        
        // Compare traversal lists
        return p1.equals(q1);
    }

    void getTree(TreeNode node, ArrayList<String> list) {
        if (node == null) {
            list.add("null"); // Represent nulls to preserve structure
            return;
        }
        list.add(String.valueOf(node.val)); // Add current node's value
        getTree(node.left, list);          // Traverse left
        getTree(node.right, list);         // Traverse right
    }
}
