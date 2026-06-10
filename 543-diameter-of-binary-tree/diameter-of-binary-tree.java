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

    int maxi=0;

   
    int check(TreeNode node){

        if(node == null){
            return 0;
        }

        if(node.left == null && node.right == null){
            return 1;
        }

        int left= check(node.left);
        int right=check(node.right);

         maxi=Math.max(maxi,left + right);



         return Math.max(left,right)+1;






    }

    public int diameterOfBinaryTree(TreeNode root) {
  

  if(root.left == null && root.right == null){
    return 0;
  }
     check(root);
      return maxi;
        
    }
}