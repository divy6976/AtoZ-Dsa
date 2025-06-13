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
class BSTIterator {
ArrayList<Integer> list=new ArrayList<>();
int cnt=-1;

void inorder(TreeNode node){
    if(node==null){
        return;
    }
    inorder(node.left);
    list.add(node.val);
    inorder(node.right);

}
    public BSTIterator(TreeNode root) {
       inorder(root);

        
    }
    
    public int next() {
        cnt=cnt+1;
       return list.get(cnt);
        
    }
    
    public boolean hasNext() {
          return cnt + 1 < list.size();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */