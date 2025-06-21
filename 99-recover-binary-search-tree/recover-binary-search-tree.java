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
  int i=0;
    void inorder(TreeNode node,ArrayList<Integer> list){
        if(node==null) return;


inorder(node.left,list);
list.add(node.val);
inorder(node.right,list);


    }
   void recover(TreeNode node,ArrayList<Integer> list){
        if(node==null) return;

        recover(node.left,list);
        if(node.val !=list.get(i)){
        node.val=list.get(i);
        }
        i++;
        recover(node.right,list);
    }

    public void recoverTree(TreeNode root) {
        ArrayList<Integer> list=new ArrayList<>();
        inorder(root,list);
        
        Collections.sort(list);
        recover(root,list);

    }
}