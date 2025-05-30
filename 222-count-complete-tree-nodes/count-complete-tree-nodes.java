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
    public int countNodes(TreeNode root) {
        int cnt=0;
        int arr[]=new int[1];
        arr[0]=0;
    count(root,arr);
    for(int i=0;i<arr.length;i++){
        cnt =arr[0];
    }
return cnt;
    

    }
    void count(TreeNode node,int[] arr){
        if(node==null){
            return ;
        }
        
        arr[0]=arr[0]+1;
        count(node.left,arr);
        count(node.right,arr);
    }
}