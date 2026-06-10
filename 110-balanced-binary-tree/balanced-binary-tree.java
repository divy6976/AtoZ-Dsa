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
   

  int check(TreeNode node){

     if(node == null){
        return 0;
     }
    

       if(node.left == null && node.right == null){
        return 1;
       }

        int left=check(node.left);
        int right=check(node.right);

        if(Math.abs(left-right) > 1){
            
            return -1;
        
            
        }
        if(left == -1 || right == -1){
    return -1;
}


        return Math.max(right , left) +1;
        

    }


    public boolean isBalanced(TreeNode root) {

        if(root == null){
            return true;
        }

        int ans=check(root);
        if(ans == -1){
            return false;
        }

        return true;


    
    }
}