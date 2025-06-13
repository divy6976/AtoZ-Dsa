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
    ArrayList<Integer> list=new ArrayList<>();
    void inorder(TreeNode node){
        if(node==null) return;
        inorder(node.left);
        list.add(node.val);
        inorder(node.right);

    }
    public boolean findTarget(TreeNode root, int k) {
        inorder(root);
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if((list.get(i)+list.get(j))==k){
                    return true;
                }
            }
            
        }
        return false;
    }
}