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

    void check(ArrayList<Integer> ans,TreeNode node,int k){
        if(node == null){
            return ;
        }
       
       ans.add(node.val);
       check(ans,node.left,k);
       check(ans,node.right,k);
    }

    public int kthSmallest(TreeNode root, int k) {

        ArrayList<Integer> ans=new ArrayList<>();

        check(ans,root,k);
        Collections.sort(ans);

        return ans.get(k-1);
        
    }
}