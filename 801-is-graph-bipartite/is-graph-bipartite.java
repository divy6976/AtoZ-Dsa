class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] color = new int[n];

        for (int i = 0; i < color.length; i++) {
            color[i] = -1;
        }

        int yes = 0;
        int no = 1;

        for (int start = 0; start < n; start++) {
            if (color[start] != -1) continue;

            Queue<Integer> q = new LinkedList<>();
            q.offer(start);
            color[start] = yes;

            while (!q.isEmpty()) {
                int node = q.poll();

                for (int neighbour : graph[node]) {
                    if (color[neighbour] == -1 && color[node] == yes) {
                        color[neighbour] = no;
                        q.offer(neighbour);
                    } else if (color[neighbour] == -1 && color[node] == no) {
                        color[neighbour] = yes;
                        q.offer(neighbour);
                    } else if (color[node] == color[neighbour]) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}
