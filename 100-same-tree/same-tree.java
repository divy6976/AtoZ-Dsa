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
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        getPostOrder(p, list1);
        getPostOrder(q, list2);

        return list1.equals(list2); // Directly compare lists
    }

    void getPostOrder(TreeNode node, ArrayList<Integer> list) {
        if (node == null) {
            list.add(null); // Keep structure information
            return;
        }

        getPostOrder(node.left, list);
        getPostOrder(node.right, list);
        list.add(node.val); // Post-order: left, right, node
    }

}