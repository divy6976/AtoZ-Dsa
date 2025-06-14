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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer>result=new ArrayList<>();
        TreeNode curr=root;
    
    

        while(curr!=null){

           if(curr.left!=null){
            TreeNode leftchild=curr.left;
            while(leftchild.right!=null){
                leftchild=leftchild.right;
            }
            leftchild.right=curr;
            TreeNode temp=curr;
            curr=curr.left;
            temp.left=null;
           }else{
            result.add(curr.val);
            curr=curr.right;
           }


        }


        return result;
        

    }
}