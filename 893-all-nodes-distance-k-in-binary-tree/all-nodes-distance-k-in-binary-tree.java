/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    HashMap<TreeNode, TreeNode> parent = new HashMap<>();
    List<Integer> result = new ArrayList<>();

    void pair(TreeNode node) {
        if (node == null) return;

        if (node.left != null) {
            parent.put(node.left, node);
            pair(node.left);
        }

        if (node.right != null) {
            parent.put(node.right, node);
            pair(node.right);
        }
    }

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        if (root == null) return result;

        pair(root);  // build parent map
        bfs(target, k);
        return result;
    }

    void bfs(TreeNode target, int k) {
        Queue<TreeNode> q = new LinkedList<>();
        Set<TreeNode> visited = new HashSet<>();

        q.offer(target);
        visited.add(target);

        while (!q.isEmpty()) {
            if (k == 0) break;

            int level = q.size();
            for (int i = 0; i < level; i++) {
                TreeNode node = q.poll();

                if (node.left != null && !visited.contains(node.left)) {
                    q.offer(node.left);
                    visited.add(node.left);
                }

                if (node.right != null && !visited.contains(node.right)) {
                    q.offer(node.right);
                    visited.add(node.right);
                }

                if (parent.containsKey(node)) {
                    TreeNode par = parent.get(node);
                    if (!visited.contains(par)) {
                        q.offer(par);
                        visited.add(par);
                    }
                }
            }
            k--;
        }

        while (!q.isEmpty()) {
            result.add(q.poll().val);
        }
    }
}
