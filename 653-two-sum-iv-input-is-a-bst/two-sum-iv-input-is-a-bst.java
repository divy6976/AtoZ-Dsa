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
   class BSTIterator{
      private  Stack<TreeNode>st=new Stack<>();
        boolean reverse=true;
        public BSTIterator(TreeNode node, boolean isReverse){
reverse=isReverse;
pushAll(node);
        }
       boolean hasNext(){
        return !st.isEmpty();
       }
       int next(){
        TreeNode temp=st.pop();
        if(reverse==false){
            pushAll(temp.right);
        }else{
            pushAll(temp.left);
        }
return temp.val;
       }
  private  void   pushAll(TreeNode node){
        while(node!=null){
            st.push(node);
if (reverse == false) {
                node = node.left;  // ✅ FIXED: go left for in-order
            } else {
                node = node.right; // ✅ FIXED: go right for reverse in-order
            }
        }
       }
    }
class Solution {
  
    public boolean findTarget(TreeNode root, int k) {
       if(root==null) return false;
       BSTIterator l=new BSTIterator(root,false);
       BSTIterator r=new BSTIterator(root,true);
       int i=l.next();
       int j=r.next();

  while (i < j) {
            if (i + j == k) {
                return true;
            } else if (i + j < k) {
                 i = l.next(); // ✅ Fix: Safe check before calling next()
                
            } else {
                 j = r.next(); // ✅ Fix: Safe check before calling next()
                
            }
        }
return false;
    }
}
