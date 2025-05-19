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
    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();
    preorder(p, list1);
    preorder(q, list2);
    return list1.equals(list2);
}

void preorder(TreeNode node, List<Integer> list) {
    if (node == null) {
        list.add(null); // to keep structure
        return;
    }
    list.add(node.val);
    preorder(node.left, list);
    preorder(node.right, list);
}

}