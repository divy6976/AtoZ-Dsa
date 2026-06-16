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

    TreeNode search(TreeNode node,int val){
        if(node == null ){
            return node;
        }
        if(node.val == val){
            return node;

        }
        if(node.val > val){
          return  search(node.left,val);
        }else {
           return search(node.right,val);
        }
      

    }

    public TreeNode searchBST(TreeNode root, int val) {


    TreeNode node= search(root,val);

    if(node == null){
        return null;
    }

   return node;

        
    }
}