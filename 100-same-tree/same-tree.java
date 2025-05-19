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
        ArrayList<TreeNode>p1=new ArrayList<>();
        ArrayList<TreeNode>q1=new ArrayList<>();
        getp(p,p1);
        getq(q,q1);

   
   if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;

        // Recursively check left and right subtrees
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);

    }

void getp(TreeNode node,  ArrayList<TreeNode>p1){
    if(node==null){
        return ;
    }
    getp(node.left,p1);
  
    getp(node.right,p1);
    p1.add(node);

}
void getq(TreeNode node, ArrayList<TreeNode>q1){
    if(node==null){
        return ;
    }
    getq(node.left,q1);
    getq(node.right,q1);
    q1.add(node);

}

}