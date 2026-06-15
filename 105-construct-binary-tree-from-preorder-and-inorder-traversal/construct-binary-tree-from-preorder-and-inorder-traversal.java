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

    int idx=0;

   TreeNode build(int[] preorder,int[] inorder,int start,int end){
      
        if(start > end ){
            return null;
        }
          int rootval=preorder[idx++];

        int found=-1;


        for(int i=start;i<=end;i++){
            if(inorder[i] == rootval){
                found=i;
                break;
                
            }
        }

        TreeNode root=new TreeNode(rootval);

        root.left= build(preorder,inorder,start,found-1);
        root.right = build(preorder,inorder,found+1,end);

        return root;
    }




    public TreeNode buildTree(int[] preorder, int[] inorder) {

        TreeNode root=build(preorder,inorder,0,inorder.length-1);


        return root;
        
    }
}