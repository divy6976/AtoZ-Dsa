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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        boolean direc = true;
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        
        if (root == null) {
            return result;
        }

        queue.offer(root);

        while (!queue.isEmpty()) {
            int level = queue.size();
            ArrayList<Integer> sublist = new ArrayList<>();

            for (int i = 0; i < level; i++) {
                TreeNode node = queue.poll();

                if (node.left != null) {
                    queue.offer(node.left);
                }

                if (node.right != null) {
                    queue.offer(node.right);
                }

                if (direc) {
                    sublist.add(node.val);
                } else {
                    sublist.add(0, node.val);
                }
            }

            result.add(sublist);
            direc = !direc;
        }

        return result;
    }
}