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

    void preorder(TreeNode node,ArrayList<Integer> pre){
        if(node == null){
            pre.add(null);
            return ;
        }
        pre.add(node.val);
        preorder(node.left,pre);
        preorder(node.right,pre);
    }

    void postorder(TreeNode node,ArrayList<Integer> post){
        if(node == null){
            post.add(null);
            return ;
        }
        postorder(node.left,post);
        postorder(node.right,post);
        post.add(node.val);
    }

    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        if(root.left == null && root.right == null){
            return true;
        }

        ArrayList<Integer> pre=new ArrayList<>();

        preorder(root.left,pre);
        ArrayList<Integer> post=new ArrayList<>();
 
  
        postorder(root.right,post);

        Collections.reverse(post);

        return pre.equals(post);
     




    }
}