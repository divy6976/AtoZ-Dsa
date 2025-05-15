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
    public List<Integer> postorderTraversal(TreeNode root) {
        TreeNode cur=root;
    TreeNode temp=null;
    Stack<TreeNode> st=new Stack<>();
    ArrayList<Integer> result=new ArrayList<>();
while(cur!=null ||!st.isEmpty()){
    if(cur!=null){
        st.push(cur);
        cur=cur.left;

    }else{
        temp=st.peek().right;
        if(temp==null){
            temp=st.peek();
            st.pop();
            result.add(temp.val);
            while(!st.isEmpty() && temp==st.peek().right){
                temp=st.peek();
                st.pop();
                result.add(temp.val);
            }

        }
        else{
            cur=temp;
        }
    }
}
return result;
    }
}