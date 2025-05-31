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
 
int idx;

TreeNode solve(int[] postorder, int[] inorder,int start,int end){
    if(start>end) return  null;
    int rootval=postorder[idx];
    int i=start;
    for(i=start;i<inorder.length;i++){
        if(inorder[i]==rootval){
            break;
        }
          
    }
    idx--;
     TreeNode root=new TreeNode(rootval);
      root.right=solve(postorder,inorder,i+1,end);
        root.left=solve(postorder,inorder,start,i-1);
       
return root;

}


    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n=postorder.length;
        idx=n-1;
        return solve(postorder,inorder,0,n-1);

    }
}