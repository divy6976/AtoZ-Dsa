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

    void check(TreeNode node,ArrayList<Integer> ans){
        if(node == null){
            ans.add(null);
            return ;
        }
         ans.add(node.val);
        if(node.left!=null){
        check(node.left,ans);
        }else {
            ans.add(null);
            
        }
       
        if(node.right !=null){
        check(node.right,ans);
        }else {
            ans.add(null);
        }
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {


        ArrayList<Integer> ans=new ArrayList<>();
        ArrayList<Integer> res=new ArrayList<>();

        check(p,ans);
        check(q,res);

        if(ans.size() != res.size()){
            return false;

        }

        return ans.equals(res);
     
      
    }
}