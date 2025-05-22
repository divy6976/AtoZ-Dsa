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

void left(TreeNode node, ArrayList<Integer>list1){
if(node==null){
  list1.add(null);
  return ;
}
    list1.add(node.val);
    left(node.left,list1);
    left(node.right,list1);



}
void right(TreeNode node, ArrayList<Integer>list2){
if(node==null){
  list2.add(null);
  return ;
}
    list2.add(node.val);
    right(node.right,list2);
    right(node.left,list2);



}



    public boolean isSymmetric(TreeNode root) {
        ArrayList<Integer>list1=new ArrayList<>();
         ArrayList<Integer>list2=new ArrayList<>();
         left(root.left,list1);
         right(root.right,list2);
         return list1.equals(list2);
    }
}